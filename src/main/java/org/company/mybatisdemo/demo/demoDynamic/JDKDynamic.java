package org.company.mybatisdemo.demo.demoDynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface UserService {
    void addUser(String username, String password);
}

interface DeptService {
    void addDept(String deptName);
}

class UserServiceImpl implements UserService {

    @Override
    public void addUser(String username, String password) {
        System.out.println(username + "用户添加成功");
    }
}

class DeptServiceImpl implements DeptService {

    @Override
    public void addDept(String username) {
        System.out.println(username + "部门添加成功");
    }

}

class JdkDynamicProxy implements InvocationHandler {

    private Object object;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志1");
        Object invoke = method.invoke(object, args);
        System.out.println("日志2");
        return invoke;
    }

    public Object newProxyInstance(Object obj) {
        this.object = obj;
        Object o =
                Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
        return o;
    }
}

class JDKDynamic {
    public static void main(String[] args) {
        JdkDynamicProxy proxy = new JdkDynamicProxy();

        // 转换为 UserService 接口
        UserService userService = (UserService) proxy.newProxyInstance(new UserServiceImpl());
        userService.addUser("ls", "1234");

        // 转换为 DeptService 接口
        DeptService deptService = (DeptService) proxy.newProxyInstance(new DeptServiceImpl());
        deptService.addDept("销售部");
    }
}