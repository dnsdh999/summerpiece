package com.summerroot.summerpiece.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/** by민정 : 뷰 연결 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("main");
        registry.addViewController("/login").setViewName("members/login");
        registry.addViewController("/admin").setViewName("members/admin");
        registry.addViewController("/signup").setViewName("members/signup");
    }
}


