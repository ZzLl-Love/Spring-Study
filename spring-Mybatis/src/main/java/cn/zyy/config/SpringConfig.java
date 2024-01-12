package cn.zyy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: Zz
 * @Date: 2023/11/11/14:32
 * @Description: 致敬
 */
@Configuration
@ComponentScan("cn.zyy")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {

}
