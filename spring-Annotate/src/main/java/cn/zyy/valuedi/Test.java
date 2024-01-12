package cn.zyy.valuedi;

import cn.zyy.valuedi.config.SpringConfig;

import cn.zyy.valuedi.domain.DbProperties;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zz
 * @Date: 2023/11/08/11:55
 * @Description: 致敬
 */
public class Test {

    ApplicationContext application = null;

    @Before
    public void init(){
        application = new AnnotationConfigApplicationContext(SpringConfig.class);
    }


    @org.junit.Test
    public void testValue(){
        DbProperties bean = application.getBean(DbProperties.class);
        System.out.println(bean);
    }
}
