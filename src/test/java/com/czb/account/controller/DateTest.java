package com.czb.account.controller;

import com.czb.account.AccountApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AccountApplication.class)
public class DateTest {

    @Test
    public void test(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 0);
        Date time = calendar.getTime();
        System.out.println(time);
    }
}
