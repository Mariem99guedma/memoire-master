package com.memoire.kafkaservice.kafka;



import com.memoire.kafkaservice.Model.Course;
import com.memoire.kafkaservice.Model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MessageType {


	OBJECT("Teacher", Teacher.class),
	OBJECT2("Course", Course.class);


	private final String type;
	private final Class<? extends KafkaTransferable> deserializationClass;

}
