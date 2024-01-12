package cn.zyy.mapper.impl;

import cn.zyy.domain.Student;
import cn.zyy.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zz
 * @Date: 2023/11/10/16:20
 * @Description: 致敬
 */
@Repository(value="studentMapper")
public class StudentMapperImpl implements StudentMapper {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Student queryStudent(Integer id) {
        String sql = "SELECT * FROM student WHERE id = ? ";
        Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), id);
        return student;
    }

    @Override
    public int insert(Student student) {
        String sql = "INSERT INTO student Values(null, ?, ?, ?)";
        int update = jdbcTemplate.update(sql, student.getName(), student.getAge(), student.getClass_id());
        return update;
    }

    @Override
    public int[] insertsBath(List<Student> students) {

        //1.准备sql语句
        String addSql = "INSERT INTO student Values(null, ?, ?, ?)";

        List<Object[]> batchArgs = new ArrayList<>();

        for (Student student : students) {
            Object[] args = {student.getName(), student.getAge(), student.getClass_id()};
            batchArgs.add(args);
        }

        int[] ints = jdbcTemplate.batchUpdate(addSql, batchArgs);
        return ints;
    }
}
