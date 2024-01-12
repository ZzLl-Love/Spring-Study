package cn.zyy.fullAnnotation.Service.impl;

import cn.zyy.fullAnnotation.Service.UserService;
import cn.zyy.fullAnnotation.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author: Zz
 * @Date: 2023/11/07/23:13
 * @Description: 致敬
 */
@Service(value="userService" )
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userMapper2")
    private UserMapper userMapper;

    public void save() {
        System.out.println(userMapper);
        userMapper.save();
    }
}
