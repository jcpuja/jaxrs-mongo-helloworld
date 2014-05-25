package com.jcpuja.jaxrsmongohelloworld;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.net.UnknownHostException;

public class MyResourceConfig extends ResourceConfig {
    public static final String MESSAGES_COLLECTION = "messagesCollection";

    public MyResourceConfig() {
        register(new MyBinder());
        packages(true, "com.jcpuja.jaxrsmongohelloworld");
    }

    public class MyBinder extends AbstractBinder {

        @Override
        protected void configure() {
            DB helloworld;
            try {
                helloworld = new MongoClient("localhost").getDB("helloworld");
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
            Jongo jongo = new Jongo(helloworld);

            bind(jongo.getCollection("messages")).to(MongoCollection.class).named(MESSAGES_COLLECTION);

            bind(HelloService.class).to(HelloService.class);
        }
    }
}
