package com.amazonbestsellingbooks.amazonbestsellingbooks.service;

import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.Course;
import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.KafkaTransferable;
import com.amazonbestsellingbooks.amazonbestsellingbooks.Model.Teacher;
import com.amazonbestsellingbooks.amazonbestsellingbooks.kafka.HandleIncomingKafkaMessages;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    public void handle(KafkaTransferable toHandle) {
        Teacher castType = (Teacher) toHandle;
        System.out.println("this Teacher service");

    }
}
