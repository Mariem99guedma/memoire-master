package com.memoire.kafkaservice.kafka;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.UUID;

@Service
public class KafkaProducer {


    private static final String TOPIC = "users";

    @Autowired
    ObjectMapper mapper;

    @Autowired
    private KafkaTemplate<Object, Object> kafkaTemplate;

    public <K extends KafkaTransferable> void sendMessage(K message) throws JsonProcessingException {
        System.out.println(String.format("#### -> Producing message -> %s", message));
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        String id = UUID.randomUUID().toString();


        ProducerRecord<Object, Object> record = new ProducerRecord<Object, Object>(KafkaUtils.topic,
                mapper.writeValueAsString(message));

        record.headers().add(KafkaUtils.HEADER_MESSAGE_TYPE, message.getClass().getSimpleName().getBytes());
        record.headers().add(KafkaUtils.HEADER_MESSAGE_KEY, id.getBytes());

        ListenableFuture<SendResult<Object, Object>> response = kafkaTemplate.send(record);


        if(response.completable().isCompletedExceptionally()) {
            System.out.println(String.format("[ERROR] : {%s} task not completed", id));
        } else {
            System.out.println(String.format("[OK]    : {%s} task completed", id)) ;
        }
    }
}
