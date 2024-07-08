package com.example.redis_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisDemoApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void testString() {
        // 写入String数据
        redisTemplate.opsForValue().set("name","fkh");
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("name = " + name);
    }

}
