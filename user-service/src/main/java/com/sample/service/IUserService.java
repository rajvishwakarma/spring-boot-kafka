package com.sample.service;

import java.util.List;

import com.sample.models.User;

public interface IUserService {

	List<User> getUsers();

	User postUsers(User user);

}
