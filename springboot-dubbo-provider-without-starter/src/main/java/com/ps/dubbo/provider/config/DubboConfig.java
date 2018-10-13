package com.ps.dubbo.provider.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:dubbo/dubbo.provider.cfg.xml")
public class DubboConfig {
}
