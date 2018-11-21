package com.univer.novice.kafka;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author guwei
 */
public interface Source {

    String TASK_OUTPUT = "task-output";

    @Output(Source.TASK_OUTPUT)
    MessageChannel taskOutput();
}
