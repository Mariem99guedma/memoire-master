package com.amazonbestsellingbooks.amazonbestsellingbooks.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class KafkaConsumer {

        @KafkaListener(topics = "users", groupId = "group_id")
        public void consume(String message) throws IOException {
            System.out.println(String.format("#### -> Consumed message -> %s", message));
        }

}
