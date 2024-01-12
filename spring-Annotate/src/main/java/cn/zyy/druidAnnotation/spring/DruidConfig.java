package cn.zyy.druidAnnotation.spring;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: Zz
 * @Date: 2023/11/08/12:09
 * @Description: 致敬
 */
@Configuration
public class DruidConfig {

    @Value("jdbc.username")
    private String username;

    @Value("jdbc.password")
    private String password;

    @Value("jdbc.url")
    private String url;

    @Value("jdbc.driver")
    private String driver;

    @Bean
    public DataSource dataSource(){
        final DruidDataSource source = new DruidDataSource();
        source.setUsername(username);
        source.setPassword(password);
        source.setDriverClassName(driver);
        source.setUrl(url);
        return source;
    }
}
