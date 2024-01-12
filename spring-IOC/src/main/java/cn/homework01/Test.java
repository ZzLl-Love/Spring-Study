package cn.homework01;

import cn.homework01.domain.Student;
import cn.homework01.service.StudentService;
import cn.homework01.service.impl.StudentServiceImpl;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Zz
 * @Date: 2023/11/06/21:27
 * @Description: 致敬
 */
public class Test {

     private ApplicationContext context = null;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("homework.xml");
    }

    /**
     * DI 通过[构造器]给 Student 的属性赋初值
     */
    @org.junit.Test
    public void testHomework01_ByConstructor(){

        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    /**
     *DI 通过<constructor-arg index="0"></constructor-arg> 标签给指定的 参数 赋予 指定的值
     */
    @org.junit.Test
    public void testHomework01_ByConstructor_Index(){
        Student student3 = context.getBean("student3", Student.class);
        System.out.println(student3);
    }

    /***
     * DI 通过[setter方法]给 Student 的属性赋初值
     */
    @org.junit.Test
    public void testHomeWork01_BySetter(){
        Student student2 = context.getBean("student2", Student.class);
        System.out.println(student2);
    }


    /**
     * ========================================作业二=============================================================
     */

    /**
     * 通过构造器给userMapper对象赋值
     */
    @org.junit.Test
    public void testHomeWork02_ByConstructor(){

        //将作业1的student对象利用
        Student addStu = context.getBean("student2", Student.class);

        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.save(addStu);

        //cn.homework01.service.impl.StudentServiceImpl@df27fae
        System.out.println(studentService);
    }

    /**
     * 通过 setter方式给 userMapper赋值
     */
    @org.junit.Test
    public void testHomeWork02_BySetter(){

        //添加对象
        //Student student = context.getBean("student", Student.class);

        StudentServiceImpl studentService1 = context.getBean("studentService1", StudentServiceImpl.class);
        studentService1.save(new Student());
        //studentService1.save(student);

        //cn.homework01.service.impl.StudentServiceImpl@df27fae
        System.out.println(studentService1);
    }

    /**
     * 通过自动装配根据名字ByName
     */
    @org.junit.Test
    public void testHomeWork02_ByAutoWire_ByName(){

        //添加对象
        Student student = context.getBean("student", Student.class);
        StudentServiceImpl studentService2 = context.getBean("studentService2", StudentServiceImpl.class);
        studentService2.save(student);
        //cn.homework01.service.impl.StudentServiceImpl@df27fae
        System.out.println(studentService2);
    }
}
