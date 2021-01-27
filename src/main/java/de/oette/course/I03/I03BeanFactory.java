package de.oette.course.I03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class I03BeanFactory {

    @Bean(value = "spanish")
    public I03GreetingTranslator spanishTranslator() {
        return new I03SpanishGreetingTranslator();
    }

    @Bean(value = "danish")
    public I03GreetingTranslator danishTranslator() {
        return new I03GreetingDanishTranslator();
    }
}
