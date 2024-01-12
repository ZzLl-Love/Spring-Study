package cn.homework01.mapper.impl;

import cn.homework01.domain.Student;
import cn.homework01.mapper.StudentMapper;

/**
 * @Author: Zz
 * @Date: 2023/11/06/22:11
 * @Description: 致敬
 */
public class StudentMapperImpl implements StudentMapper {

    public StudentMapperImpl() {
        System.out.println("mapper的无参构造器被执行了");
    }

    @Override
    public int insert(Student student) {
        System.out.println(student.getName()+"学生保存成功");
        return  1;
    }
}
