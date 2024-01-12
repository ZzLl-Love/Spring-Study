package cn.zyy.dynamicPoxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Zz
 * @Date: 2023/11/08/16:54
 * @Description: 致敬
 *
 * 该类可以访问一个代理对象
 */
public class VehicleProxy {

    //被代理对象
    private Vehicle target_vehicle;

    public VehicleProxy(Vehicle target_vehicle) {
        this.target_vehicle = target_vehicle;
    }


    /**
     * 编写方法，返回代理对象
     */
    public  Vehicle getProxy(){

        //类的加载器
        ClassLoader classLoader = target_vehicle.getClass().getClassLoader();

        //被代理对象的接口信息
        Class<?>[] interfaces = target_vehicle.getClass().getInterfaces();


        //创建 InvocationHandler 对象
        /**
         * 该方法是执行代理对象的 方法 时 会被调用到
         * @param  proxy     表示代理对象
         * @param  method    表示通过代理对象调用方法是的哪个方法  代理对象.run()  method = run()
         * @param  args      表示代理对象.run(xxx)  传入的参数
         */
       InvocationHandler invocationHandler =  new InvocationHandler(){

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("交通工具开始运行了.....");
                Object result = method.invoke(target_vehicle, args);
                System.out.println("交通工具停止运行了......");
                return result;
            }
        };

        /**解读：newProxyInstance() 该方法可以返回一个代理对象、
         *
         *  public static Object newProxyInstance(
         *       ClassLoader loader,
         *       Class<?>[] interfaces,
         *       InvocationHandler h)
         *
         *  @param
         *   ClassLoader loader,        类的加载器
         *   Class<?>[] interfaces,    被代理对象的接口信息
         *   InvocationHandler h        调用处理器对象 ，有一个重要方法invoke
         *
         */
        Vehicle instance = (Vehicle)Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return instance;
    }
}
