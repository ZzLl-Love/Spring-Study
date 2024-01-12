package cn.zyy.cglibProxy.service.impl;

import cn.zyy.cglibProxy.service.IStudentService;

/**
 * @Author: Zz
 * @Date: 2023/11/08/20:43
 * @Description: 致敬
 */
public class StudentServiceImpl implements IStudentService {

    @Override
    public void save() {
        System.out.println("保存学生用户信息");
    }
}
