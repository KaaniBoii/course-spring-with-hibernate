package de.oette.course.J02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@SpringBootTest(classes = PrototypeBeanTest.TestConfig.class)
public class PrototypeBeanTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototypeScope() {
        {
            DataTransportObject obj = applicationContext.getBean(DataTransportObject.class);
            obj.setValue("one");
            System.out.println(obj);
        }
        {
            DataTransportObject obj =  applicationContext.getBean(DataTransportObject.class);
            System.out.println(obj);
        }
    }


    @Configuration
    public static class TestConfig {
        @Bean
        @Scope("prototype")
        public DataTransportObject dataTransportObject() {
            return new DataTransportObject();
        }
    }

    public static class DataTransportObject {

        @Value("${to.string.prefix}")
        private String toStringPrefix;

        String value;

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return toStringPrefix +  value;
        }
    }
}
