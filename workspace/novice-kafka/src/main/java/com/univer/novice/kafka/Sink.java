package com.univer.novice.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author guwei
 */
public interface Sink {

    String TASK_INPUT = "task-input";

    @Input(Sink.TASK_INPUT)
    SubscribableChannel taskInput();
}
