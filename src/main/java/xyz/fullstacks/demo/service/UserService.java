package xyz.fullstacks.demo.service;

import java.util.List;

import xyz.fullstacks.demo.domain.User;

public interface UserService {
	List<User> list();
	User getUser(Long id);
	User saveUser(User user);
	void deleteUser(Long id);
	void deleteUser(User user);
}
