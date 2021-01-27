package de.oette.course.I01;

import org.springframework.stereotype.Component;

@Component(value ="demoComponent")
public class I01DemoComponent {

    public void printHello() {
        System.out.println("Hello");
    }
}
