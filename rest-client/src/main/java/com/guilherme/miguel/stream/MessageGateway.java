package com.guilherme.miguel.stream;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * Message Gateway
 *
 * @author Miguel Guilherme
 */
@MessagingGateway
public interface MessageGateway {

    @Gateway(requestChannel = Source.OUTPUT)
    void sendMessage(String message);


}
