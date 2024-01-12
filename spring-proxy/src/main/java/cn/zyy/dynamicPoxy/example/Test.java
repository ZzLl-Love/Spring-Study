package cn.zyy.dynamicPoxy.example;

/**
 * @Author: Zz
 * @Date: 2023/11/08/17:24
 * @Description: 致敬
 */
public class Test {

    @org.junit.Test
    public void test1(){

        Vehicle car = new Car();

        //获取提供代理对象的 VehicleProxy对象
        VehicleProxy vehicleProxy = new VehicleProxy(car);

        //获取代理对象
        Vehicle proxy = vehicleProxy.getProxy();
        proxy.run();
    }
}
