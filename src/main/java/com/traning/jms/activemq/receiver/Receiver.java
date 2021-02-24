package com.traning.jms.activemq.receiver;

import com.traning.jms.activemq.model.Email;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
//Message Driven POJO
public class Receiver {
    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(Email email){
        log.info("Received<" + email + ">");
    }
}
