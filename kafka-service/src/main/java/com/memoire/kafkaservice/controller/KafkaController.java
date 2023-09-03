package com.memoire.kafkaservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.memoire.kafkaservice.Model.Course;
import com.memoire.kafkaservice.Model.Teacher;
import com.memoire.kafkaservice.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    KafkaProducer producer;

    @PostMapping("/teacher")
    public void sendMessageToKafkaTopic(@RequestBody Teacher message) throws JsonProcessingException {
        this.producer.sendMessage(message);
    }

    @PostMapping("/course")
    public void sendMessageToKafkaTopic(@RequestBody Course message) throws JsonProcessingException {
        this.producer.sendMessage(message);
    }

}
