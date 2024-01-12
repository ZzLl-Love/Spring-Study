package cn.zyy;

import cn.zyy.aspectj.SmartAnimalable;
import cn.zyy.aspectj.SmartDog;
import cn.zyy.config.SpringConfig;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zz
 * @Date: 2023/11/09/11:39
 * @Description: 致敬
 */
public class AopAspectjTest {

    ApplicationContext context = null;

    @Before
    public void init(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }


    /**
     *测试是否能够正常拿到bean
     */
    @org.junit.Test
    public void test1(){

        /**
         * getBean()  只能通过接口来获取，获取实际的类型会报错
         */
        SmartAnimalable bean = context.getBean(SmartAnimalable.class);
        System.out.println(bean.getClass());
        bean.getSum(1,2);

    }
}
