package lk.ijse.gdse66.userservice.repo;

import lk.ijse.gdse66.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
