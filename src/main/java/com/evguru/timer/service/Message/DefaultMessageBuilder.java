package com.evguru.timer.service.Message;

import org.springframework.stereotype.Component;

@Component
public class DefaultMessageBuilder implements MessageBuilder{

    @Override
    public String buildGreetingMessage() {
        return "Hello, amigo!";
    }
}
