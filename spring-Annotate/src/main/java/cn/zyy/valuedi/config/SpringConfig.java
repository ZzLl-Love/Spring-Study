package cn.zyy.valuedi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: Zz
 * @Date: 2023/11/08/11:53
 * @Description: 致敬
 */
@Configuration
@ComponentScan("cn.zyy.valuedi")
@PropertySource("db.properties")
public class SpringConfig {
}
