package com.airline.service.api.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AddViewConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/flight").setViewName("/flight/flight");
      registry.addViewController("/flightbooking").setViewName("/flight/bookinginfo");
    }
}
