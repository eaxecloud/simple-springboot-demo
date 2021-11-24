package xyz.fullstacks.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import xyz.fullstacks.demo.domain.User;
import xyz.fullstacks.demo.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{id}")
    public User get(@PathVariable("id") Long userId){
        return userService.getUser(userId);
    }
	
	@GetMapping("/")
    public List<User> list(){
        return userService.list();
    }
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
    public User add(@RequestBody User user){
        return userService.saveUser(user);
    }
	
	@PutMapping("/")
    public User update(@RequestBody User user){
        return userService.saveUser(user);
    }
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
    }
}
