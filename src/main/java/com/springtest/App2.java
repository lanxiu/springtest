package com.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App2 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World11!" );
        SpringApplication.run(App2.class, args);
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("").getPath());
        System.err.println(ResourceUtils.getURL("classpath:" ).getPath());
        System.out.println(System.getProperty("server.tomcat.basedir"));
        
        
        ;
    }
    
    
    @Bean
    WebMvcConfigurer createWebMvcConfigurer(@Autowired HandlerInterceptor[] interceptors) {
        return new WebMvcConfigurer() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                // 映射路径`/static/`到classpath路径:
                registry.addResourceHandler("/static/**")
                        .addResourceLocations("classpath:/static/");
            }
        };
    }
    
}



