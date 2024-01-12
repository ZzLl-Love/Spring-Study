package cn.zyy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @Author: Zz
 * @Date: 2023/11/11/14:34
 * @Description: 致敬
 */


@Configuration
@PropertySource("jdbc.properties")
public class JdbcConfig {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private  String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.driver}")
    private String driver;


    /**
     * 配置德鲁伊数据源
     * @return
     */
    @Bean
    public DataSource dataSource(){
        DruidDataSource source = new DruidDataSource();
        source.setUrl(url);
        source.setUsername(username);
        source.setPassword(password);
        source.setDriverClassName(driver);
        return source;
    }


}
