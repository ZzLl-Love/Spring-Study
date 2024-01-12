package cn.zyy.druidAnnotation.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: Zz
 * @Date: 2023/11/08/12:03
 * @Description: 致敬
 */
@Configuration
@ComponentScan("cn.zyy.druidAnnotation")
@Import(DruidConfig.class)
public class SpringConfig {

}
