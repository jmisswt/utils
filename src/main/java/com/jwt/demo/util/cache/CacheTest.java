package com.jwt.demo.util.cache;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author jiangwentao
 * @description 缓存测试
 * @createTime 2022年09月29日 14:21
 */
@RestController
@RequestMapping("/cache")
public class CacheTest {

    private static final Cache<String, String> CODE_CACHE = new Cache<>();

    @PostMapping("/test")
    public void testCache() {
        System.out.println(CODE_CACHE.get("111"));
        if (CODE_CACHE.get("111") == null) {
            CODE_CACHE.put("111", "aa1", 1, TimeUnit.MINUTES);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        CODE_CACHE.put("jwt111","jwt111",10,TimeUnit.SECONDS);
        CODE_CACHE.put("jwt222","jwt222",20,TimeUnit.SECONDS);
        for (int i=0;i<30;i++){
            System.out.println(CODE_CACHE.get("jwt111"));
            System.out.println(CODE_CACHE.get("jwt222"));
            Thread.sleep(1000);
        }
    }
}
