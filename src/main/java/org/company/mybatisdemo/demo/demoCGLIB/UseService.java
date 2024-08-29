package org.company.mybatisdemo.demo.demoCGLIB;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public interface UseService {
    void addUser(String username, String password);
}

class UseServiceImpl implements UseService {

    @Override
    public void addUser(String username, String password) {
        System.out.println(username + "用户添加成功");
    }
}

class CglibProxy implements MethodInterceptor {

    public Enhancer enhancer = new Enhancer();

    public Object getDaoBean(Class cls) {
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("日志1");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("日志2");
        return o1;
    }
}

class Main3 {
    public static void main(String[] args) {
        CglibProxy u = new CglibProxy();
        UseService daoBean = (UseService) u.getDaoBean(UseServiceImpl.class);
        daoBean.addUser("qqq", "1212");
    }
}
