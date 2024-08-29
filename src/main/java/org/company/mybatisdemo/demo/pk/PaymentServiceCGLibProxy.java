package org.company.mybatisdemo.demo.pk;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

// CGLib 动态代理实现
public class PaymentServiceCGLibProxy {
    public static PaymentServiceImpl createProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PaymentServiceImpl.class);
        enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
            System.out.println("CGLib Proxy - Before payment");
            Object result = proxy.invokeSuper(obj, args);
            System.out.println("CGLib Proxy - After payment");
            return result;
        });
        return (PaymentServiceImpl) enhancer.create();
    }
}
