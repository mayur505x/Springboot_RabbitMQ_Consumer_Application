package com.bridgelabz.springrabbitmqconsumer.controller;

import com.bridgelabz.springrabbitmqconsumer.config.MQConfig;
import com.bridgelabz.springrabbitmqconsumer.entity.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }
}
