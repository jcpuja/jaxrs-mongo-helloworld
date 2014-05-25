package com.jcpuja.jaxrsmongohelloworld;


import com.jcpuja.jaxrsmongohelloworld.domain.Message;
import org.jongo.MongoCollection;

import javax.inject.Inject;
import javax.inject.Named;

public class HelloService {
    @Inject
    @Named(MyResourceConfig.MESSAGES_COLLECTION)
    MongoCollection messages;

    public String provideClichedMessage() {
        Message clichedMessage = messages.findOne().as(Message.class);

        return clichedMessage != null ? clichedMessage.getMessage() : "Message not found";
    }
}
