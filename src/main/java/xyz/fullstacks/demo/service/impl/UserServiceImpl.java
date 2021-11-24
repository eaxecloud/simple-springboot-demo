package xyz.fullstacks.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.fullstacks.demo.domain.User;
import xyz.fullstacks.demo.repository.UserRepository;
import xyz.fullstacks.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> list() {
		return userRepository.findAll();
	}
	
	@Override
	public User getUser(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User saveUser(User user) {
		return userRepository.saveAndFlush(user);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public void deleteUser(User user) {
		userRepository.delete(user);
	}
}
