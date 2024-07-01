package lk.ijse.gdse66.userservice.service;

import lk.ijse.gdse66.userservice.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUser();
    UserDTO saveUser(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    void deleteUser(UserDTO userDTO);
    UserDTO findUserById(String id);
}
