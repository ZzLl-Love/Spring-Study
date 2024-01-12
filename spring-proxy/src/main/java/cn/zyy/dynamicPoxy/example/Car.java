package cn.zyy.dynamicPoxy.example;

/**
 * @Author: Zz
 * @Date: 2023/11/08/16:51
 * @Description: 致敬
 */
public class Car implements Vehicle {

    @Override
    public void run() {
        System.out.println("小汽车在路上running.....");
    }
}
