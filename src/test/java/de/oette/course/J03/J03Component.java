package de.oette.course.J03;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class J03Component {

    @Transactional
    public boolean loadFlag() {
        System.out.println("load flag");
        return true;
    }
}
