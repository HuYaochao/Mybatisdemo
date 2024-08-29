package org.company.mybatisdemo.demo.pk;

import java.lang.reflect.Proxy;

// JDK 动态代理实现
public class PaymentServiceJDKProxy {
    public static PaymentService createProxy(PaymentService paymentService) {
        return (PaymentService) Proxy.newProxyInstance(
                paymentService.getClass().getClassLoader(),
                paymentService.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("JDK Proxy - Before payment");
                    Object result = method.invoke(paymentService, args);
                    System.out.println("JDK Proxy - After payment");
                    return result;
                }
        );
    }
}
