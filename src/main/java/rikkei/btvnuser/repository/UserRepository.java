package rikkei.btth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rikkei.btth.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>
{
    List<User> findByUsername(String username);
    List<User> findByFullName(String username);


}

