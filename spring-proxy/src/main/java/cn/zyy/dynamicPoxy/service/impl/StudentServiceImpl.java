package cn.zyy.dynamicPoxy.service.impl;

import cn.zyy.dynamicPoxy.domain.Student;
import cn.zyy.dynamicPoxy.service.IStudentService;

/**
 * @Author: Zz
 * @Date: 2023/11/08/15:21
 * @Description:
 *
 * 代理类
 */
 public class StudentServiceImpl implements IStudentService {

    @Override
    public void save() {
        System.out.println("保存学生信息");
    }

    @Override
    public Student query(Long id) {
        System.out.println("查询操作");
        Student student = new Student();
        student.setName("sy");
        student.setAge(18);
        return student;
    }
}
