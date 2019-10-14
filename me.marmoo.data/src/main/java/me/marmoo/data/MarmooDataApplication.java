package me.marmoo.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.manager.*","me.marmoo.data"})
@MapperScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.dao.*"})
public class MarmooDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(MarmooDataApplication.class,args);
    }
}
