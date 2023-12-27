package com.enduser.enduser.config;

import com.enduser.enduser.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {

    @KafkaListener(topics = AppConstants.LOCATION_TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void updatedLocation(String message){
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = AppConstants.TEST_TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void testTopic(String message){
        System.out.println("Consumed test message: " + message);
    }
}
