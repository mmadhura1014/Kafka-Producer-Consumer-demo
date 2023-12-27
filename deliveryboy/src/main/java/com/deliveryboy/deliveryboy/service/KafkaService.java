package com.deliveryboy.deliveryboy.service;

import com.deliveryboy.deliveryboy.config.AppConstants;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public boolean updateLocation(String location){
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
        System.out.println("Location updated successfully");
        return true;
        }

    public boolean testTopic(String message){
        this.kafkaTemplate.send(AppConstants.TEST_TOPIC_NAME, message);
        System.out.println("Message sent successfully");
        return true;
        }
}

