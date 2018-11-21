package com.univer.novice.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author guwei
 */
@EnableBinding(Source.class)
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    @Autowired
    private Source source;

    public void sendTaskMessage(String message) {
        source.taskOutput().send(MessageBuilder.withPayload(message).build());
    }

}
