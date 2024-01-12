package cn.distudy.diConstructor;

import cn.distudy.diCollection.domain.CollectionsDemo;
import cn.distudy.diConstructor.domian.Student;
import cn.distudy.diConstructor.service.IStudentService;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Author: Zz
 * @Date: 2023/11/06/17:03
 * @Description: 致敬
 */
public class Test {

    ApplicationContext context = null;

    @Before
    public void init(){
         context = new ClassPathXmlApplicationContext("diconstructor.xml");
    }

    /**
     * 测试通过构造器给service层的StudentMapper赋值
     */
    @org.junit.Test
    public void testDI_Constructor(){
        //StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
        IStudentService studentService = context.getBean("studentService", IStudentService.class);
        //System.out.println(studentMapper);
        System.out.println(studentService);
        studentService.insert(new Student());

    }

    /**
     * 测试通过构造器给service层的userMapper，studentMapper 赋值 ，即给多个引用类型赋值
     */
    @org.junit.Test
    public void testDI_Constructors(){
        IStudentService studentService = context.getBean("studentService", IStudentService.class);
        studentService.delete(1l);
    }


    /**
     * 测试给集合注入属性
     *
     */

    @org.junit.Test
    public void testDI_Collections(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("diCollection.xml");
        CollectionsDemo collectionsDemo = context.getBean("collectionsDemo", CollectionsDemo.class);
        collectionsDemo.print();
    }
}
