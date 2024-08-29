package org.company.mybatisdemo.demo.pk;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Proxy;

// 客户端测试代码
public class Client {
    public static void main(String[] args) {
        // 使用 JDK 动态代理
        PaymentService paymentServiceJDKProxy = PaymentServiceJDKProxy.createProxy(new PaymentServiceImpl());
        paymentServiceJDKProxy.pay(100);

        // 使用 CGLib 动态代理
        PaymentServiceImpl paymentServiceCGLibProxy = PaymentServiceCGLibProxy.createProxy();
        paymentServiceCGLibProxy.pay(200);
    }
}

