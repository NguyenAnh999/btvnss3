package rikkei.btth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkei.btth.model.User;
import rikkei.btth.repository.UserRepository;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public List<User> Getalusers()
    {
        return userRepository.findAll();
    }

    public List<User> Getuserbyusername(String name)
    {
        return userRepository.findByUsername(name);
    }

    public List<User> GetusersbyfullName(String fullName)
    {
        return userRepository.findByFullName(fullName);
    }

    public User Updateuser(User user)
    {
      return userRepository.save(user);
    }

    public void Delete(User user)
    {
      userRepository.delete(user);
    }

    public User Insertuser( User user)
    {
     return    userRepository.save(user);

    }

}