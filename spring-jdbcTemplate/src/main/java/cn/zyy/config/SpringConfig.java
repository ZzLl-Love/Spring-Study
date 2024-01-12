package cn.zyy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: Zz
 * @Date: 2023/11/10/15:48
 * @Description: 致敬
 */
@Configuration
@ComponentScan("cn.zyy")
@Import(DruidConfig.class)
public class SpringConfig {
}
