package com.curd.curd_with_mongodb.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.curd_with_mongodb.Documents.User;
import com.curd.curd_with_mongodb.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // ArrayList<String> jobs = new ArrayList<>(Arrays.asList("Web Developer",
    // "Android Developer", "IOS Developer",
    // "Graphic Designer", "Frontend Developer", "Backend Developer", "Full Stack
    // Developer", "SEO Expert"));

    ArrayList<String> jobs = new ArrayList<>();

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

    public User updateUser(String id, User user) {
        return userRepository.findById(id).map(existingUser -> {
            existingUser.setName(user.getName());
            existingUser.setAge(user.getAge());
            return userRepository.save(existingUser);
        }).orElseThrow(() -> new RuntimeException("User with ID " + id + " not found"));
    }

    public String saveJob(User user) {
        jobs.addAll(user.getJobs());
        return "Jobs added successfully";
    }

    public ArrayList<String> jobs() {
        return jobs;
    }

    public String emptyList() {
        jobs.removeAll(jobs);
        return "List is now empty";
    }
}
