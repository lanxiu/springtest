package com.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Hello world!
 *
 */
//@SpringBootApplication
//public class App 
//{
//    public static void main( String[] args ) throws Exception
//    {
//        System.out.println( "Hello World!" );
//        SpringApplication.run(App.class, args);
//        System.out.println(Thread.currentThread().getContextClassLoader().getResource("").getPath());
//        System.err.println(ResourceUtils.getURL("classpath:" ).getPath());
//        System.out.println(System.getProperty("server.tomcat.basedir"))
//        ;
//    }
//    
//    
//    @Bean
//    WebMvcConfigurer createWebMvcConfigurer(@Autowired HandlerInterceptor[] interceptors) {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addResourceHandlers(ResourceHandlerRegistry registry) {
//                // 映射路径`/static/`到classpath路径:
//                registry.addResourceHandler("/static/**")
//                        .addResourceLocations("classpath:/static/");
//            }
//        };
//    }
//    
//}



@SpringBootApplication 
public class App3 extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(App3.class);
	}
	
	//H:\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\springtest\WEB-INF\classes
	//tomcat 路径
	public static void main(String[] args) throws Exception {
		System.out.println( "Hello World! tomcat" );
		SpringApplication.run(App3.class, args);
		System.out.println( "Hello World! tomcat" );
    }
}
