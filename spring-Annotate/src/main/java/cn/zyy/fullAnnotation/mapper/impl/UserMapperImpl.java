package cn.zyy.fullAnnotation.mapper.impl;

import cn.zyy.fullAnnotation.mapper.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: Zz
 * @Date: 2023/11/07/20:22
 * @Description: 致敬
 */

@Repository(value="userMapper1")
public class UserMapperImpl implements UserMapper {

    public void save() {
        System.out.println("保存用户信息成功~");
    }
}
