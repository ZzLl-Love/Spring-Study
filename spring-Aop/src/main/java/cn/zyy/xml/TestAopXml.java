package cn.zyy.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Zz
 * @Date: 2023/11/09/19:45
 * @Description: 致敬
 */
public class TestAopXml {

    @Test
    public void testAopXml(){

        ApplicationContext ioc =  new ClassPathXmlApplicationContext("AopXml.xml");
        SmartAnimalable bean = ioc.getBean(SmartAnimalable.class);
        bean.getSum(1,2);
    }
}
