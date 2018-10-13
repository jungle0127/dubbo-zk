package com.ps.dubbo.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:dubbo.consumer.cfg.xml")
public class DubboConfig {
}
