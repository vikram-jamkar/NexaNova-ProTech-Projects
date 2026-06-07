package com.vikram.mockeval.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.mockeval.entity.User;
import com.vikram.mockeval.service.UserService;
@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
             private final UserService userService;
             
             //contructer
             public UserController(UserService userService) {
				this.userService = userService;}
             
 @PostMapping
 public User createUser(@RequestBody User user) {
	 return userService.saveUser(user);
 }
 
 // 🔹 Get User By Id
 @GetMapping("/{id}")
 public User getUser(@PathVariable Long id) {
     return userService.getUserById(id);
 }
 // 🔹 Get All Users (optional)
 @GetMapping
 public List<User> getAllUsers() {
     return userService.getAllUsers();
 }  
//🔹 Delete User
 @DeleteMapping("/{id}")
 public void deleteUser(@PathVariable Long id) {
     userService.deleteUser(id);
 }
 @PutMapping("/{id}")
 public User updateUser(@PathVariable Long id, @RequestBody User user) {
     return userService.updateUser(id, user);
 }
 @PostMapping("/login")
 public String login(@RequestBody User user) {

     User u = userService.login(user.getEmail(), user.getPassword());

     if (u == null) {
         return "Invalid email or password";
     }

     return "Login successful";
 }}
