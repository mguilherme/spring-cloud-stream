package com.guilherme.miguel.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Configuration;

/**
 * Cloud Stream Config.
 *
 * @author Miguel Guilherme
 */
@Configuration
@EnableBinding(Processor.class)
public class CloudStreamConfig {
}
