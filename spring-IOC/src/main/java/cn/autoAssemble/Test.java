package cn.autoAssemble;

import cn.autoAssemble.servie.IEmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Zz
 * @Date: 2023/11/06/20:19
 * @Description: 致敬
 */
public class Test {

    @org.junit.Test
    public void testAutoWire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");

       IEmployeeService employeeService = context.getBean("employeeService", IEmployeeService.class);
       employeeService.delete(1l);
    }
}
