package cn.zyy.fullAnnotation.mapper.impl;

import cn.zyy.fullAnnotation.mapper.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: Zz
 * @Date: 2023/11/07/23:44
 * @Description: 致敬
 */
@Repository("userMapper2")
public class UserMapperImpl1 implements UserMapper {
    @Override
    public void save() {
        System.out.println("这是我的第二个userMapper");
    }
}
