package de.oette.course.J01;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProxyScopedService {

    private final String randomNumber;

    public ProxyScopedService() {
        this.randomNumber = RandomStringUtils.randomNumeric(3);
    }

    public String getRandomNumber() {
        return randomNumber;
    }
}
