package com.example.demo.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class ResourceConfig implements WebMvcConfigurer {

 

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String uploadLocation = "D://spring//mobiles//src//main//resources//UpLoads//";
        registry
        .addResourceHandler("/UpLoads/**")
        .addResourceLocations("file:"+uploadLocation);
WebMvcConfigurer.super.addResourceHandlers(registry);

    }
}
