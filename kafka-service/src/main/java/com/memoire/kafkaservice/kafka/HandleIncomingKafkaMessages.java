package com.memoire.kafkaservice.kafka;


import com.memoire.kafkaservice.Model.Course;
import com.memoire.kafkaservice.Model.Teacher;
import com.memoire.kafkaservice.service.CourseService;
import com.memoire.kafkaservice.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HandleIncomingKafkaMessages {

    @Autowired
    TeacherService teacherService;

    @Autowired
    CourseService courseService;

    public void handle(KafkaTransferable toHandle){
        if(toHandle.getClass().isInstance(Teacher.class)){
            teacherService.handle(toHandle);
        }

        if(toHandle.getClass().isInstance(Course.class)){
            courseService.handle(toHandle);
        }
    };

}
