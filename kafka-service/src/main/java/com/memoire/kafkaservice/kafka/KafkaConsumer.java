package com.memoire.kafkaservice.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;

@Component
public class KafkaConsumer {


    @Autowired
    ObjectMapper mapper;

    @Autowired
    HandleIncomingKafkaMessages handler;

        @KafkaListener(topics = "Amazon-BestSellingBooks", groupId = "group_id")
        public void consume(@Payload final String message,
                            @Header(KafkaUtils.HEADER_MESSAGE_TYPE) final String messageType,
                            @Header(KafkaUtils.HEADER_MESSAGE_KEY) final String kafkaMessageKey) throws IOException {
            KafkaTransferable messageModel = null;
            try {
                Class<? extends KafkaTransferable> deserializationClass = getDeserializationClass(messageType);
                messageModel = mapper.readValue(message, deserializationClass);
            } catch (IOException e) {
                System.out.println(String.format("[ERROR] : {%s} task not completed", kafkaMessageKey));
                e.printStackTrace();
            }

            System.out.println(String.format("[OK]    : {%s} task completed", kafkaMessageKey));
            handler.handle(messageModel);
        }


    private static Class<? extends KafkaTransferable> getDeserializationClass(final String messageType) {
        return Arrays.stream(MessageType.values())
                .filter(eventType -> eventType.getType().equals(messageType))
                .findFirst()
                .map(MessageType::getDeserializationClass)
                .orElseThrow(() -> new RuntimeException(String.format("No Class registered to deserialize: %s", messageType)));
    }

}
