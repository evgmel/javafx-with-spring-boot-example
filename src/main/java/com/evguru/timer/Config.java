package com.evguru.timer;

import com.evguru.timer.service.Message.DefaultMessageBuilder;
import com.evguru.timer.service.Message.HappyMessageBuilder;
import com.evguru.timer.service.Message.MessageBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan  // Searches components by fully qualified class name
public class Config {

    @Bean
    public MessageBuilder messageBuilder() {
        return new HappyMessageBuilder();
    }
}
