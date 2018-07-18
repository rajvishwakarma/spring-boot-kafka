package com.sample.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.models.Notification;

@Repository
public interface NotificationRepo extends CrudRepository<Notification, Long>{

}
