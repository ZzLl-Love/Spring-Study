package cn.zyy.fullAnnotation;

import cn.zyy.fullAnnotation.Service.UserService;
import cn.zyy.fullAnnotation.Service.impl.UserServiceImpl;
import cn.zyy.fullAnnotation.config.SpringConfig;
import cn.zyy.fullAnnotation.mapper.impl.UserMapperImpl;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Zz
 * @Date: 2023/11/07/20:38
 * @Description: 致敬
 */
public class Test {


    private ApplicationContext context = null;

    @Before
    public void init(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //System.out.println(context);
    }


    /**
     *测试使用全注解进行开发
     *
     * 之前半注解(配置bean)+半xml(扫描注解)开发
     *
     * 现在全注解 配置bean(注解)   + 扫描注解(配置类@Configuration+扫描注解@ComponentScan)
     */
    @org.junit.Test
    public void testRepository(){
        UserMapperImpl userMapper = context.getBean("userMapper", UserMapperImpl.class);
        userMapper.save();
    }

    /**
     * 测试autoWired
     */
    @org.junit.Test
    public void testAutoWired(){
        UserService userService = context.getBean("userService", UserServiceImpl.class);
        userService.save();
    }


    /**
     * 测试按照类型自动注入时， 比如service有两个mapper实例
     */
    @org.junit.Test
    public void testQualifier(){
        Object userMapper = context.getBean("userMapper");
        System.out.println(userMapper);

        Object userMapperImpl1 = context.getBean("userMapper1");
        System.out.println(userMapperImpl1);
    }
}
