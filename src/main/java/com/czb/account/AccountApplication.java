package com.czb.account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;

@SpringBootApplication
public class AccountApplication {
    private final static Logger LOGGER = LoggerFactory.getLogger(AccountApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }
    @PostConstruct
    public void printLog(){
        LOGGER.info("master 当前系统时间为：{}",System.currentTimeMillis());
    }
}
