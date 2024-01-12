package cn.beaninstance;

import cn.beaninstance.domian.Employee;
import cn.beaninstance.domian.Goods;
import cn.beaninstance.domian.Person;
import cn.beaninstance.domian.Phone;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Zz
 * @Date: 2023/11/06/11:23
 * @Description: 致敬
 */
public class Test {

    ClassPathXmlApplicationContext context = null;

    @Before
    public void init(){
        //获取spring容器对象
       context = new ClassPathXmlApplicationContext("beansinstance.xml");

    }

    /**
     * 测试通过构造器实例化bean
     */
    @org.junit.Test
    public void test1(){
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }


    /**
     *通过静态工厂方法来创建bean
     */
    @org.junit.Test
    public void testStaticFactorytoCreateBean(){
        Goods goods = context.getBean("goods", Goods.class);
        System.out.println(goods);
    }


    /**
     * 测试通过实例工厂方法来创建Bean
     */
    @org.junit.Test
    public void testFactoryInstanceMethodInit(){
        Phone phone =(Phone)context.getBean("phone");
        System.out.println(phone);
    }


    /**
     * 测试通过实现FactoryBean来创建bean
     */
    @org.junit.Test
    public void testFactoryBeanInit(){
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
        Employee employee1 = context.getBean("employee", Employee.class);
        System.out.println(employee1);
        employee.check();
    }
}
