package cn.zyy.xmlandAnnotate;

import cn.zyy.xmlandAnnotate.mapper.impl.UserMapperImpl;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Zz
 * @Date: 2023/11/07/20:25
 * @Description:
 *
 * 测试使用 注解 + xml(配置包的扫描路径)
 */
public class Test {

    private ApplicationContext  context = null;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("springben.xml");
        System.out.println(context);
    }


    /**
     * userMapperImpl 是 使用@Repository 注入
     * 扫描是通过xml的  <context:component-scan></context:component-scan>
     */
    @org.junit.Test
    public void testRepository(){
        UserMapperImpl userMapperImpl = context.getBean("userMapper", UserMapperImpl.class);
        userMapperImpl.save();
    }
}
