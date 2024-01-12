package cn.distudy.diSetter;

import cn.distudy.diSetter.mapper.EmployeeMapper;
import cn.distudy.diSetter.service.IEmployeeService;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Zz
 * @Date: 2023/11/06/19:08
 * @Description: 致敬
 */
public class Test {

    ApplicationContext context = null;

    @Before
    public void init(){
       context = new ClassPathXmlApplicationContext("beansSetters.xml");
    }


    /**
     * 测试Setter注入引用类型对象
     */
    @org.junit.Test
    public void testDI_Setter(){

        //拿到service对象
        IEmployeeService employeeService = context.getBean("employeeService", IEmployeeService.class);
        employeeService.delete(1l);
    }
}
