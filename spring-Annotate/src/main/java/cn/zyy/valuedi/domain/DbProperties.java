package cn.zyy.valuedi.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Zz
 * @Date: 2023/11/08/11:50
 * @Description: 致敬
 */
@Component

public class DbProperties {

    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Override
    public String toString() {
        return "DbProperties{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
