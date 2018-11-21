package com.univer.novice.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author guwei
 */
@EnableBinding(Sink.class)
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);


    @Autowired
    protected ObjectMapper objectMapper;

    @StreamListener(Sink.TASK_INPUT)
    public void receiveTaskMessage(String message) {
        logger.info("receive task message : " + message);
    }

}
