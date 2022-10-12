package com.dx.Proxy;

import com.dx.Dao.UserDao;
import com.dx.Dao.UserDaoImpl;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类代理对象
   /*     Class[] interfaces = {UserDao.class};
        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });*/
        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserDao userdao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserProxy(userDaoImpl));
        int add = userdao.add(1, 2);
        System.out.println("result" + add);

    }
}

//创建代理对象代码
class UserProxy implements InvocationHandler {
    //1、把创建的是谁的代理对象，把谁传递过来
    //2、有参构造传递
    private Object object;

    public UserProxy(Object object) {
        this.object = object;
    }

    /**
     * 增强的逻辑
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前执行..." + method.getName() + "传递的参数..." + Arrays.toString(args));

        //被增强的方法执行

        Object res = method.invoke(object, args);

        //方法之后
        System.out.println("方法之后执行..." + object);
        return res;
    }
}
