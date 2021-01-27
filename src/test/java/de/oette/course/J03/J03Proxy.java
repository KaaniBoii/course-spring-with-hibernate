package de.oette.course.J03;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class J03Proxy implements MethodInterceptor {

    private final Object proxiedObject;

    public J03Proxy(Object proxiedObject) {
        this.proxiedObject = proxiedObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Special logic before method call");
        Object result = method.invoke(proxiedObject, objects);
        System.out.println("Special logic before method call");

        return result;
    }
}
