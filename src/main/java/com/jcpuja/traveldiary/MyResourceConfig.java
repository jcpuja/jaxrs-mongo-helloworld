package com.jcpuja.traveldiary;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

public class MyResourceConfig extends ResourceConfig {
    public MyResourceConfig() {
        register(new MyBinder());
        packages("com.jcpuja.traveldiary");
    }

    public class MyBinder extends AbstractBinder {

        @Override
        protected void configure() {
            bind(HelloService.class).to(HelloService.class);
        }
    }
}
