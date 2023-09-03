package com.memoire.kafkaservice.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.support.KafkaHeaders;

public class KafkaUtils extends KafkaHeaders {

    @Value("${kafka.topic}")
    public static String topic;
    public static final String HEADER_MESSAGE_TYPE = "message-type";
    public static final String HEADER_MESSAGE_KEY = "message-Key";
}
