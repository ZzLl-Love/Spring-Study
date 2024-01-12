package cn.zyy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: Zz
 * @Date: 2023/11/09/11:38
 * @Description: 致敬
 */
@Configuration
@ComponentScan("cn.zyy")
@EnableAspectJAutoProxy //不开启不会用动态代理
public class SpringConfig {
}
