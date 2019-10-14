package me.marmoo.data.config;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class HarikaCPConfig {

    @Value("${hikari.url}")
    private String url;
    @Value("${hikari.username}")
    private String username;
    @Value("${hikari.password}")
    private String password;

    @Bean
    public DataSource hikariPool(){
        HikariConfig config=new HikariConfig();
        config.setJdbcUrl(url);
        config.setPassword(password);
        config.setUsername(username);
        config.setMaximumPoolSize(15);
        config.setMaxLifetime(10000);
        config.setMinimumIdle(5);
        config.setDriverClassName("com.mysql.jdbc.Driver");
        HikariDataSource dataSource=new HikariDataSource(config);

        return dataSource;
    }

}
