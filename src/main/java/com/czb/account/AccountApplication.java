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
    //分支master
    private final static Logger LOGGER = LoggerFactory.getLogger(AccountApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }

    @PostConstruct
    public void printLog(){
        //分支master
        LOGGER.info("master 当前系统时间为：{}",System.currentTimeMillis());
    }
}
