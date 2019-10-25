package me.marmoo.data.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.RedisSentinelConnection;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
public class RedisConfig {
    @Value("${redis.password}")
    private String password;

    @Bean
    public RedisConnectionFactory lettuceConnectionFactory(){
        RedisSentinelConfiguration sentinelConfiguration=new RedisSentinelConfiguration().master("r1").sentinel("114.55.64.54",26379).sentinel("114.55.64.54",26380).sentinel("114.55.64.54",26381);
        sentinelConfiguration.setPassword(RedisPassword.of(password));
        return new LettuceConnectionFactory(sentinelConfiguration);


    }

}
