package cn.zyy.mapper;

import cn.zyy.domain.Student;

import java.util.List;

/**
 * @Author: Zz
 * @Date: 2023/11/10/16:18
 * @Description: 致敬
 */
public interface StudentMapper {

    /**
     * 查询学生
     * @param id
     */
    Student queryStudent(Integer id);

    /**
     * 插入学生
     * @param student
     * @return
     */
    int insert(Student student);


    int[] insertsBath(List<Student> students);

}
