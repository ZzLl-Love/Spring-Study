package cn.zyy.dynamicPoxy.service;

import cn.zyy.dynamicPoxy.domain.Student;

/**
 * @Author: Zz
 * @Date: 2023/11/08/15:20
 * @Description: 致敬
 */
public interface IStudentService {

    /**
     * 添加学生
     */
    void save();


    /**
     * 查询学生信息
     * @param id
     * @return
     */
    Student query(Long id);
}
