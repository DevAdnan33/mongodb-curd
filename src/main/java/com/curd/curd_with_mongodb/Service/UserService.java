package com.curd.curd_with_mongodb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.curd_with_mongodb.Documents.User;
import com.curd.curd_with_mongodb.Repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

   // private User user;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(String id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User with ID " + id + " not found"));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

}
