package com.memoire.kafkaservice.service;

import com.memoire.kafkaservice.Model.Teacher;
import com.memoire.kafkaservice.kafka.KafkaTransferable;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    public void handle(KafkaTransferable toHandle) {
        Teacher castType = (Teacher) toHandle;
        System.out.println("this Teacher service");

    }
}
