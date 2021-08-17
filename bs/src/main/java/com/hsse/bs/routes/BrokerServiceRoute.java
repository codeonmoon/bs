package com.hsse.bs.routes;

import com.hsse.bs.exception.BrokerServiceException;
import com.hsse.bs.model.Payment;
import com.hsse.bs.model.Response;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BrokerServiceRoute extends RouteBuilder {

    private static final Logger logger = LoggerFactory.getLogger(BrokerServiceRoute.class);

    @Override
    public void configure() throws Exception {

        onException(BrokerServiceException.class).process(new Processor() {
            public void process(Exchange exchange) throws Exception {
                Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
                logger.error("Exception occurred in Broker Service {} ", cause.getMessage());
            }
        }).handled(true);

        from("{{bs.in}}")
                .unmarshal()
                .json(JsonLibrary.Jackson, Payment.class)
                .log("transactionId from bs.in: ${body.transactionId}")
                .marshal()
                .jacksonxml()
                .to("{{fcs.in}}");
        from("{{bs.out}}")
                .unmarshal()
                .jacksonxml(Response.class)
                .log("transactionId from bs.out: ${body.transactionId}")
                .marshal()
                .json(JsonLibrary.Jackson, Response.class)
                .to("{{pps.out}}");
    }
}