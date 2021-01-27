package de.oette.course.J03;

import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

class J03ProxyTest {

    @Test
    void testWrapComponentInProxy() {
        J03Component component = new J03Component();
        //component.loadFlag();

        J03Component proxiedComponent = (J03Component) Enhancer.create(J03Component.class, new J03Proxy(component));

        proxiedComponent.loadFlag();
    }
}
