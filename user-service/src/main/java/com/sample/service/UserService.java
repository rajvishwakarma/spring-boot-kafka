package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.datastax.driver.core.utils.UUIDs;
import com.sample.kafka.producer.Sender;
import com.sample.models.User;
import com.sample.repo.UserRepo;

@Service
public class UserService implements IUserService {
	
	@Value("${spring.kafka.topic.userCreated}")
    private String USER_CREATED_TOPIC;
	
	@Autowired
    private Sender sender;
	
	@Autowired
	UserRepo userRepo;

	@Override
	public List<User> getUsers() {
		return (List<User>) userRepo.findAll();
	}

	@Override
	public User postUsers(User user) {
		user.setId(UUIDs.timeBased());
		user.setIsActive(true);
		User createdUser = userRepo.save(user);
        sender.send(USER_CREATED_TOPIC, createdUser);
        return createdUser;
	}
	
}