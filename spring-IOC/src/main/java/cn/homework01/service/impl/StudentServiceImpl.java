package cn.homework01.service.impl;

import cn.homework01.domain.Student;
import cn.homework01.mapper.StudentMapper;
import cn.homework01.service.StudentService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author: Zz
 * @Date: 2023/11/06/22:12
 * @Description: 致敬
 */
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;

    public StudentServiceImpl() {
        System.out.println("service无参构造器被调用了...");
    }

    @Override
    public int save(Student student) {

       return studentMapper.insert(student);
    }

    /**
     * 通过构造函数给studentMapper 赋值
     * @param studentMapper
     */
    public StudentServiceImpl(StudentMapper studentMapper) {
        System.out.println("构造函数被执行了....");
        this.studentMapper = studentMapper;
    }


    /**
     * 通过set方式  给 studentMapper 赋值
     */
    public void setStudentMapper(StudentMapper studentMapper) {
        System.out.println("setter方法被执行了");
        this.studentMapper = studentMapper;
    }
}
