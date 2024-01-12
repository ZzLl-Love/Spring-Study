package cn.beaninstance.domian;

/**
 * @Author: Zz
 * @Date: 2023/11/06/11:41
 * @Description: 致敬
 * 实例工厂方法实例化
 */
public class PhoneFactory {

    private static Phone phone = new Phone();
    private PhoneFactory(){}

    public Phone getInstances(){
        return phone;
    }
}
