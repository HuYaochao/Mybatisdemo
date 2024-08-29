package org.company.mybatisdemo.demo.demoProxy;

interface UserService{
    public void addUser(String username,String password);
}

class UserServiceImpl implements UserService{

    @Override
    public void addUser(String username, String password) {
        System.out.println(username+"成功");
    }
}

class UserServiceProxy implements UserService{
    private UserService userService;

    public UserServiceProxy(UserService userService){
        this.userService=userService;
    }
    @Override
    public void addUser(String username, String password) {
        System.out.println("log1");
        userService.addUser(username,password);
        System.out.println("log2");
    }
}


public class JDKStatic {
    public static void main(String[] args) {
        UserServiceProxy u = new UserServiceProxy(new UserServiceImpl());
        u.addUser("zs","123");
    }
}
