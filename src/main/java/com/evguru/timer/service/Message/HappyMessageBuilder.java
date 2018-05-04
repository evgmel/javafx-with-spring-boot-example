package com.evguru.timer.service.Message;

public class HappyMessageBuilder implements MessageBuilder {
    @Override
    public String buildGreetingMessage(String name) {
        return "Hello, " + name + "!!! I am so happy!!!";
    }
}
