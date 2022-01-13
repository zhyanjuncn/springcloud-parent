package com.czb.account.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonTest {

    @Test
    public void test(){
        Map<String,String> map = new HashMap<>();
        map.put("java","000");
        map.put("c++","999");
        String s = JSON.toJSONString(map);
        System.out.println(s);
    }
}
