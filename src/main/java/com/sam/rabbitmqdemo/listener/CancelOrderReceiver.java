package com.sam.rabbitmqdemo.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "mall.order.cancel")
public class CancelOrderReceiver {

    @RabbitHandler
    public void handle(Long orderId){
        System.out.println("------order Id : " +orderId);
    }
}
