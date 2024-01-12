package cn.zyy.dynamicPoxy.invocation;

import cn.zyy.dynamicPoxy.DaoTransaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Zz
 * @Date: 2023/11/08/15:24
 * @Description: 致敬
 */
public class TransactionHandler implements InvocationHandler {

    //增强类对象
    private DaoTransaction transaction;

    //需要代理的目标对象
    private Object obj;

    public TransactionHandler(DaoTransaction transaction,Object obj){
        this.transaction = transaction;
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret = null;

        //判断当前方法是否是save,是才做事务操作
        if("save".equals(method.getName())){
            transaction.before();
            ret = method.invoke(obj,args);
            transaction.after();
        }else{
            ret = method.invoke(obj,args);
        }

        return ret;

    }

}

