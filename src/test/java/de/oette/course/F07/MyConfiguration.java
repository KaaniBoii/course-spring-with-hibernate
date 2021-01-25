package de.oette.course.F07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public CustomStringUtils stringUtils() {
        CustomStringUtils customStringUtils = new CustomStringUtils();
        customStringUtils.setRandomLength(30);
        customStringUtils.setUseLetters(true);
        customStringUtils.setUseNumbers(false);

        return customStringUtils;
    }
}
