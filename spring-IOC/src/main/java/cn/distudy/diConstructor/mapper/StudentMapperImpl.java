package cn.distudy.diConstructor.mapper;

import cn.distudy.diConstructor.domian.Student;

/**
 * @Author: Zz
 * @Date: 2023/11/06/16:56
 * @Description: 致敬
 */
public class StudentMapperImpl implements StudentMapper{

    @Override
    public void insert(Student student) {
        System.out.println("保存学生信息");
    }

    @Override
    public int delete(Long id) {
        System.out.println("删除id="+id+"的学生信息");
        return 1;
    }
}
