package com.ap.PorfolioApiV8;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurationSupport {

/* (non-Javadoc)
 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry)
 */
@Override
protected void addCorsMappings(CorsRegistry registry) {
    
    registry.addMapping("/**")
        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS" )
        .allowedOrigins("*")
        .allowedHeaders("*")
        .allowCredentials(false);
    }
}