package com.czb.account;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;

@SpringBootApplication
@MapperScan("com.czb.account.mapper")
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }

    private final static Logger LOGGER = LoggerFactory.getLogger(AccountApplication.class);
    @PostConstruct
    public void printLog(){

        //log-develop
        LOGGER.info("当前系统时间为：{}",System.currentTimeMillis());
    }
}
