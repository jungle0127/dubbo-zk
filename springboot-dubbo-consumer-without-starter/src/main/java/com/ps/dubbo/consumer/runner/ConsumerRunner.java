package com.ps.dubbo.consumer.runner;

import com.ps.dubbo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsumerRunner implements CommandLineRunner {
    @Autowired
    private DemoService demoService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("=======================================================");
        List<String> cityList = this.demoService.getPermissions(1L);
        for(String city: cityList){
            System.out.println(city);
        }
        System.out.println("=======================================================");
    }
}
