package com.learning.camel_microservices_b.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // TODO Auto-generated method stub
        from("activemq:my-activemq-queue")
                .to("log:Received message from active-mq");
        // throw new UnsupportedOperationException("Unimplemented method 'configure'");
    }

}
