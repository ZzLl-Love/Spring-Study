package cn.distudy.diSetter.service;

import cn.distudy.diSetter.mapper.EmployeeMapper;
import cn.distudy.diSetter.mapper.UserMapper;

/**
 * @Author: Zz
 * @Date: 2023/11/06/19:06
 * @Description: 致敬
 */
public class EmployeeServiceImpl implements  IEmployeeService{

     private EmployeeMapper employeeMapper;
     private UserMapper userMapper;

     private String name;
     private int age;


    public void  setName (String name){
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

     @Override
    public int delete(Long id) {
         System.out.println(name + ":" + age);
         userMapper.delete(id);
        return employeeMapper.delete(id);
    }


    //提供employeeMapper的setter方法
    public void setEmployeeMapper(EmployeeMapper empMapper){
         this.employeeMapper = empMapper;
    }

    //提供userMapper的setter方法
    public void setUserMapper(UserMapper userMapper){
         this.userMapper = userMapper;
    }


}
