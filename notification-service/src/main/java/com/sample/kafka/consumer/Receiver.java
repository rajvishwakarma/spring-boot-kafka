package com.sample.kafka.consumer;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.sample.models.User;
import com.sample.service.NotificationService;

@Component
public class Receiver {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch = new CountDownLatch(1);

    @Autowired
    private NotificationService notificationService;

    @KafkaListener(topics = "${spring.kafka.topic.userCreated}")
    public void receive(User payload) {
        LOGGER.info("received payload='{}'", payload);
        notificationService.postNotifications(payload);
        latch.countDown();
    }

}
