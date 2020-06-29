package com.userportal.userportal.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userportal.userportal.entity.User;
import com.userportal.userportal.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> listAllUser() {
		return userRepository.findAll();
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public List<User> updateUser(List<User> users) {
		return userRepository.saveAll(users);
	}

	public void deleteUser(Integer userId) {
		userRepository.deleteById(userId);
	}

}
