package cn.zyy.cglibProxy.interceptor;

import cn.zyy.cglibProxy.DaoTransaction;
import cn.zyy.cglibProxy.service.impl.StudentServiceImpl;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Zz
 * @Date: 2023/11/08/20:46
 * @Description: 致敬
 */
public class CglibInterceptor implements MethodInterceptor {

    DaoTransaction transaction;

    public CglibInterceptor(DaoTransaction transaction) {
        this.transaction = transaction;

    }

    /**
     *
     * @param o             代理对象
     * @param method        目标对象的方法对象
     * @param objects       方法的入参3
     * @param methodProxy   目标对象方法的代理方法， 功能跟Method差不多，
     *                      但是因为MethodProxy属于FastClass，相对Method通过反射执行速度快一些
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        transaction.before();
        Object ret = methodProxy.invokeSuper(o, objects);
        transaction.after();
        return  ret;
    }
}
