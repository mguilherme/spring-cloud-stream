package com.guilherme.miguel.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Configuration;

/**
 * Cloud Stream Config.
 *
 * @author Miguel Guilherme
 */
@Configuration
@EnableBinding({Source.class, Sink.class})
public class CloudStreamConfig {
}
