package cn.distudy.diConstructor.mapper;

import cn.distudy.diConstructor.domian.Student;

/**
 * @Author: Zz
 * @Date: 2023/11/06/16:55
 * @Description: 致敬
 */
public interface StudentMapper {

    void insert(Student student);

    int delete(Long id);
}
