package de.oette.course.H01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class H01EmailService {

    @Autowired
    private H01CustomerService customerService;

    public void sendOutgoingMessage(String sender, String text) {
        System.out.println(String.format("Simulate sending from %s: %s", sender, text));
    }

    public void receiveIncomingMessage(String receiver, String text) {
        customerService.receiveCustomerResponse(receiver, text);
    }
}
