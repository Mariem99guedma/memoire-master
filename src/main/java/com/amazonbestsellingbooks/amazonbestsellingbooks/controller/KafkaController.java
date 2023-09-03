package com.amazonbestsellingbooks.amazonbestsellingbooks.controller;

import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.Course;
import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.Teacher;
import com.amazonbestsellingbooks.amazonbestsellingbooks.kafka.KafkaProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
