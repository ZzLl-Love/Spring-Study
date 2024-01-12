package cn.zyy.mapper;

import org.springframework.stereotype.Repository;

/**
 * @Author: Zz
 * @Date: 2023/11/10/10:57
 * @Description: 致敬
 */

@Repository
public class StudentMapperImpl implements StudentMapper {

    @Override
    public void save() {
        System.out.println("保存操作");
    }
}
