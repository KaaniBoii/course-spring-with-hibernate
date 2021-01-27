package de.oette.course.J01;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "singleton")
public class SingletonScopedService {

    private final String randomNumber;

    public SingletonScopedService() {
        this.randomNumber = RandomStringUtils.randomNumeric(3);
    }

    public String getRandomNumber() {
        return randomNumber;
    }
}
