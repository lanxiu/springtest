
[TOC]

# 注解相关

class<?> 的作用 与 class的区别


# webapplicationtype
reactive web application
servlet-based web application
二者区别


# 日志未输出
将springboot部署到tomcat中使用
但是不知为何部署成功，却没有打印出log system.out

因为想看所有jar包的meta-inf中的配置文件，找了找内置tomcat并没有工作目录
然后想办法弄到外置tomcat中，全部解压lib...


参考文件
https://www.liangzl.com/get-article-detail-14348.html
https://blog.csdn.net/tstcylq/article/details/105999651
https://www.freesion.com/article/559152084/


# spring.factories
```
# Application Initializers
org.springframework.context.ApplicationContextInitializer=\
org.springframework.boot.devtools.restart.RestartScopeInitializer

# Application Listeners
org.springframework.context.ApplicationListener=\
org.springframework.boot.devtools.restart.RestartApplicationListener,\
org.springframework.boot.devtools.logger.DevToolsLogFactory.Listener

# Auto Configure
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
org.springframework.boot.devtools.autoconfigure.DevToolsDataSourceAutoConfiguration,\
org.springframework.boot.devtools.autoconfigure.LocalDevToolsAutoConfiguration,\
org.springframework.boot.devtools.autoconfigure.RemoteDevToolsAutoConfiguration

# Environment Post Processors
org.springframework.boot.env.EnvironmentPostProcessor=\
org.springframework.boot.devtools.env.DevToolsHomePropertiesPostProcessor,\
org.springframework.boot.devtools.env.DevToolsPropertyDefaultsPostProcessor

```