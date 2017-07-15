package com.guilherme.miguel.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

/**
 * Message handler
 *
 * @author Miguel Guilherme
 */
@Slf4j
@Service
public class MessageHandler {

    @StreamListener(Sink.INPUT)
    public void handle(String message) {
        log.info(message);
    }

}
