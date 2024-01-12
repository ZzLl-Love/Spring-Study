package cn.autoAssemble.servie;

import cn.autoAssemble.mapper.EmployeeMapperImpl;
import cn.distudy.diSetter.mapper.EmployeeMapper;
import cn.distudy.diSetter.mapper.UserMapper;

/**
 * @Author: Zz
 * @Date: 2023/11/06/19:06
 * @Description: 致敬
 */
public class EmployeeServiceImpl implements IEmployeeService {

     private EmployeeMapperImpl employeeMapper;


     @Override
    public int delete(Long id) {
        return employeeMapper.delete(id);
    }


    //提供employeeMapper的setter方法
    public void setEmployeeMapper1(EmployeeMapperImpl empMapper){

         this.employeeMapper = empMapper;
    }




}
