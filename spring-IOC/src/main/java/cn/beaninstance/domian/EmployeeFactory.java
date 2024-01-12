package cn.beaninstance.domian;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: Zz
 * @Date: 2023/11/06/11:52
 * @Description: 致敬
 */
public class EmployeeFactory  implements FactoryBean<Employee> {

    @Override
    public Employee getObject() throws Exception {
        System.out.println("EmployeeFactory执行到了getObject() 方法");
        return new Employee();
    }

    @Override
    public Class<?> getObjectType() {
        return Employee.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
