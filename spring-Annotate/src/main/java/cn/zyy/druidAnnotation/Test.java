package cn.zyy.druidAnnotation;

import cn.zyy.druidAnnotation.spring.DruidConfig;
import cn.zyy.druidAnnotation.spring.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @Author: Zz
 * @Date: 2023/11/08/12:17
 * @Description: 致敬
 */
public class Test {

    @org.junit.Test
    public void testDruidAnnotation(){

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DruidConfig bean = context.getBean(DruidConfig.class);
        DataSource dataSource = bean.dataSource();
        System.out.println(dataSource);

    }
}
