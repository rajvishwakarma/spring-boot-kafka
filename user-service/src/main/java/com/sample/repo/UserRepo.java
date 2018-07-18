package com.sample.repo;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.models.User;

@Repository
public interface UserRepo extends CrudRepository<User,UUID>{

}
