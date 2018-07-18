package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.datastax.driver.core.utils.UUIDs;
import com.sample.models.Notification;
import com.sample.models.User;
import com.sample.repo.NotificationRepo;

@Component
public class NotificationService implements INotificationService {
	
	@Autowired
	NotificationRepo notificationRepo;

	@Override
	public Notification postNotifications(User user) {
		Notification createdNotification = notificationRepo.save(new Notification(UUIDs.timeBased(), "abc@test.com", user.getEmail(), 
				"Welcome "+user.getName()));
        return createdNotification;
	}
	
}
