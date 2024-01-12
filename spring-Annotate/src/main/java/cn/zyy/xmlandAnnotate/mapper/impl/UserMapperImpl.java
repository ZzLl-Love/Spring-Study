package cn.zyy.xmlandAnnotate.mapper.impl;

import cn.zyy.xmlandAnnotate.mapper.UserMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: Zz
 * @Date: 2023/11/07/20:22
 * @Description: 致敬
 */

@Component(value="userMapper")
public class UserMapperImpl implements UserMapper {
    public void save() {
        System.out.println("保存用户信息成功~");
    }
}
