package com.sample.service;

import com.sample.models.Notification;
import com.sample.models.User;

public interface INotificationService {

	Notification postNotifications(User user);

}