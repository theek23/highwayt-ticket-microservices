package lk.ijse.gdse66.userservice.service.impl;

import lk.ijse.gdse66.userservice.dto.UserDTO;
import lk.ijse.gdse66.userservice.entity.User;
import lk.ijse.gdse66.userservice.repo.UserRepo;
import lk.ijse.gdse66.userservice.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepo userRepo, ModelMapper modelMapper) {
        this.userRepo = userRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<User> users = userRepo.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        // Ensure that the userDTO has a manually assigned id
        if (userDTO.getUserId() == null) {
            throw new IllegalArgumentException("User ID must be provided");
        }
        User user = modelMapper.map(userDTO, User.class);
        User savedUser = userRepo.save(user);
        return modelMapper.map(savedUser, UserDTO.class);
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        if (userDTO.getUserId() == null) {
            throw new IllegalArgumentException("User ID must be provided for update");
        }
        User user = modelMapper.map(userDTO, User.class);
        userRepo.save(user);
    }

    @Override
    public void deleteUser(UserDTO userDTO) {
        if (userDTO.getUserId() == null) {
            throw new IllegalArgumentException("User ID must be provided for delete");
        }
        User user = modelMapper.map(userDTO, User.class);
        userRepo.delete(user);
    }

    @Override
    public UserDTO findUserById(String id) {
        User user = userRepo.findById(id).orElse(null);
        if (user != null) {
            return modelMapper.map(user, UserDTO.class);
        }
        return null;
    }
}
