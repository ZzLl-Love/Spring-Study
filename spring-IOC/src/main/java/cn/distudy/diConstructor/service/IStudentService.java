package cn.distudy.diConstructor.service;

import cn.distudy.diConstructor.domian.Student;

/**
 * @Author: Zz
 * @Date: 2023/11/06/16:58
 * @Description: 致敬
 */
public interface IStudentService {

    void insert(Student student);

    int delete(Long id);
}
