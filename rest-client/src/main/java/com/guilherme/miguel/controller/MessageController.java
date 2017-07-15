package com.guilherme.miguel.controller;

import com.guilherme.miguel.stream.MessageGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;

/**
 * Message Controller
 *
 * @author Miguel Guilherme
 */
@RestController
@RequiredArgsConstructor
public class MessageController {

    private final MessageGateway messageGateway;

    @PostMapping("/message")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sendMessage(@RequestParam(required = false, defaultValue = "Default Message") String message) {
        messageGateway.sendMessage(message);

        return format("Message '%s' sent", message);
    }

}
