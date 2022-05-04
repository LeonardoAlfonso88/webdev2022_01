package com.webdev.productsystem.Shared.Infrastruture.RabbitMQ;

import com.webdev.productsystem.Shared.Domain.Bus.Event.DomainEvent;
import com.webdev.productsystem.Shared.Infrastruture.RabbitMQ.Serializable.DomainEventJsonSerializable;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePropertiesBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class RabbitMqPublisher {

    private final RabbitTemplate rabbitTemplate;

    public RabbitMqPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publish(DomainEvent domainEvent, String exchangeName) {
        String serializedDomainEvent = DomainEventJsonSerializable.serialize(domainEvent);
        Message message = new Message(
                serializedDomainEvent.getBytes(),
                MessagePropertiesBuilder.newInstance()
                    .setContentEncoding("utf-8")
                    .setContentType("application/json").build()
        );
        rabbitTemplate.send(exchangeName, domainEvent.eventName(), message);
    }
}
