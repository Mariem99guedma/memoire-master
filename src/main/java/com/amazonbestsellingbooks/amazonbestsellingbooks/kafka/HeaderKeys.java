package com.amazonbestsellingbooks.amazonbestsellingbooks.kafka;

import org.springframework.kafka.support.KafkaHeaders;

public class HeaderKeys extends KafkaHeaders {

    public static final String HEADER_MESSAGE_TYPE = "message-type";
    public static final String HEADER_MESSAGE_KEY = "message-Key";
}
