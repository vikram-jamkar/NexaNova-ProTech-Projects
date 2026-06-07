package com.institute.timetable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.institute.timetable.dto.LoginRequest;
import com.institute.timetable.entity.User;
import com.institute.timetable.repository.UserRepository;
import com.institute.timetable.securitye.JwtUtil;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    JwtUtil jwtUtil;

    /* CREATE USER */

    @PostMapping
    public User saveUser(@RequestBody User user){

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

    /* READ USERS */

    @GetMapping
    public List<User> getAllUsers(){

        return userRepository.findAll();

    }

    /* DELETE USER */

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){

        userRepository.deleteById(id);

    }

    /* LOGIN */

    @PostMapping("/login")
    public Object login(@RequestBody LoginRequest req) {

        User user = userRepository.findByEmail(req.getEmail());

        if (user == null) {
            return "User not found";
        }

        if (!passwordEncoder.matches(req.getPassword(), user.getPassword())) {
            return "Invalid password";
        }

        String token = jwtUtil.generateToken(user.getEmail(), user.getRole());

        return java.util.Map.of("token", token);
    }

    /* USER API */

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String userApi() {
        return "User Access";
    }

    /* ADMIN API */

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminApi() {
        return "Admin Access";
    }

}