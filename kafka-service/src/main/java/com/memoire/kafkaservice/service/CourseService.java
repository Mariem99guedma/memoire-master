package com.memoire.kafkaservice.service;


import com.memoire.kafkaservice.Model.Course;
import com.memoire.kafkaservice.kafka.KafkaTransferable;
import org.springframework.stereotype.Service;

@Service
public class CourseService  {

    public void handle(KafkaTransferable toHandle) {
        Course castType = (Course) toHandle;
        System.out.println("this Course service");

    }
}
