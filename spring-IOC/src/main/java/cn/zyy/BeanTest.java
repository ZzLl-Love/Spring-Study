package cn.zyy;

import cn.zyy.domain.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: Zz
 * @Date: 2023/11/05/13:41
 * @Description: 致敬
 * 怎么获取spring容器(里面维护了spring管理的bean对象)
 */
public class BeanTest {


    /**
     * 方式一：ClassPathXmlApplicationContext
     * 获取管理bean的spring容器
     */
    @Test
    public void testGetApplicationContext(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(context);
    }

    /**
     * 方式二：ClassPathXmlApplicationContext
     * 获取管理bean的spring容器
     */
    @Test
    public void testGetApplicationContext2(){
        FileSystemXmlApplicationContext context
                = new FileSystemXmlApplicationContext("D:\\十指波教育\\zyyCode\\SpringStudy\\spring-IOC\\src\\main\\resources\\beans.xml");
        System.out.println(context);
    }


    /**
     * 从spring容器种获取指定的bean
     */
    @Test
    public void getBeanFromSpringApplication(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //第一种方式，根据id值获取
        System.out.println("==================根据id获取指定bean==================");
        Student student = (Student)context.getBean("student");
        System.out.println(student);
        student.study();

        System.out.println("==================根据id+类型指定获取==================");
        Student student1 = context.getBean("student", Student.class);
        System.out.println(student1);
        student1.study();

        System.out.println("==================根据类型获取指定bean================");
        Student student3 = context.getBean(Student.class);
        System.out.println(student3);
        student3.study();


    }
}
