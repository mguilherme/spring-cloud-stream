package com.guilherme.miguel.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static java.lang.String.format;

/**
 * Message Worker.
 *
 * @author Miguel Guilherme
 */
@Slf4j
@Service
public class MessageWorker {

    @Transformer(inputChannel = Sink.INPUT, outputChannel = Source.OUTPUT)
    public String handle(String message) {
        String output = format("Message: %s - %s", message, LocalDateTime.now());

        log.info(output);

        return output;
    }

}
