package com.rediscache.springbootrediscache.api;

import com.rediscache.springbootrediscache.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RedisCacheController {

    @Autowired
    private RedisCacheService redisCacheService;

    private int sayac;

    @GetMapping
    public String cacheController() throws InterruptedException {


        if(sayac==5)
        {
            redisCacheService.clearCache();
        }
        sayac++;
        return redisCacheService.longRunningMethod();

    }
}
