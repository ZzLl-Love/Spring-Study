package cn.beaninstance.domian;

/**
 * @Author: Zz
 * @Date: 2023/11/06/11:28
 * @Description: 致敬
 * 通过静态工厂方法实例化
 */
public class Goods {

    private static Goods goods = new Goods();
    private Goods(){
        System.out.println("Goods我是私有的构造器我被调用了...");
    }

    public static Goods getInstance(){

        System.out.println("Goods静态工厂方法来创建bean");
        return goods;
    }
}
