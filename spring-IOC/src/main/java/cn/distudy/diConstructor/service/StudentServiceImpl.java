package cn.distudy.diConstructor.service;

import cn.distudy.diConstructor.domian.Student;
import cn.distudy.diConstructor.mapper.StudentMapper;
import cn.distudy.diConstructor.mapper.StudentMapperImpl;
import cn.distudy.diConstructor.mapper.UserMapper;

/**
 * @Author: Zz
 * @Date: 2023/11/06/16:59
 * @Description: 致敬
 */
public class StudentServiceImpl  implements IStudentService{


    private String name;
    private int age;
    private String email;

    private StudentMapper studentMapper;

    private UserMapper userMapper;

    /**
     * 添加构造器给studentMapper赋值
     * @param studentMapper
     */
    public StudentServiceImpl(
                              StudentMapperImpl studentMapper,
                              UserMapper userMapper,
                              String name,
                              int age,
                              String email
                             ) {
        this.studentMapper = studentMapper;
        this.userMapper = userMapper;
        this.name = name;
        this.age =age;
        this.email = email;

    }


    @Override
    public void insert(Student student) {

        studentMapper.insert(student);
    }


    /**
     * 删除时，需要使用多个Mapper对象类完成业务逻辑 ===》引出知识点  ===》怎么使用构造器配置多个引用类型参数
     *
     * @param id
     * @return
     */
    @Override
    public int delete(Long id) {

        //给多个基本属性进行赋值
        System.out.println(name +":" + age + ":" + email);
        userMapper.delete(id);
       return studentMapper.delete(id);
    }


}
