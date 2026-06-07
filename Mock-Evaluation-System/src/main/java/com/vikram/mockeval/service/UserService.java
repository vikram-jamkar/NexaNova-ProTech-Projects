package com.vikram.mockeval.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.vikram.mockeval.entity.User;
import com.vikram.mockeval.repository.UserRepository;
@Service
public class UserService {
	
	private final UserRepository userRepository ;
	// constructor (Dependency Injection)
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	 public User saveUser (User user)
	 {
		return userRepository.save(user);
		 
	 }
public List <User> getAllUsers(){
	return userRepository.findAll();
}
// 🔹 Get User By Id
public User getUserById(Long id) {
    return userRepository.findById(id).orElse(null);
}
//🔹 Delete User
public void deleteUser(Long id) {
    userRepository.deleteById(id);
}

public User login(String email, String password) {
    User user = userRepository.findByEmail(email);

    if(user == null || !user.getPassword().equals(password)) {
        return null;
    }

    return user;
}
public User updateUser(Long id, User newUser) {
    User existingUser = userRepository.findById(id).orElse(null);

    if (existingUser == null) {
        return null;
    }

    existingUser.setName(newUser.getName());
     
    existingUser.setEmail(newUser.getEmail()); 
    existingUser.setPassword(newUser.getPassword());
    existingUser.setRole(newUser.getRole());

    return userRepository.save(existingUser);
}
}






