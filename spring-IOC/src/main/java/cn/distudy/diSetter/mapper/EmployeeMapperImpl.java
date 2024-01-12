package cn.distudy.diSetter.mapper;

import cn.distudy.diSetter.domain.Employee;

/**
 * @Author: Zz
 * @Date: 2023/11/06/19:04
 * @Description: 致敬
 */
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public int delete(Long id) {
        System.out.println("删除当前员工id:"+id);
        return 1;
    }
}
