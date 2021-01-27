package de.oette.course.H01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class H01CustomerService {

    @Autowired
    private H01EmailService emailService;

    public void sendNotification() {
        // ...
        emailService.sendOutgoingMessage("Tom", "Message");
        // ...
    }


    public void receiveCustomerResponse(String receiver, String text) {

    }
}
