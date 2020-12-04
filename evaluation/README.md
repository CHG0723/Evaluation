# evaluation

学生课程评价系统

# 环境搭建
> Mysql+IDEA+springboot+前端layui

> 运行环境使用谷歌浏览器

#### 介绍
学生课程评价系统
1.  管理员
2.  老师
3.  学生

#### 软件架构(springboot)
```properties
#server.servlet.path=/evaluation
server.port=8081
# 数据源配置#
spring.datasource.url=jdbc:mysql://localhost:3306/tea_design?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8&useSSL=false
spring.datasource.hikari.username=root
spring.datasource.hikari.password=root
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.type=com.zaxxer.hikari.HikariDataSource
# mybatis配置
mybatis.type-aliases-package=com.evaluation.entity
mybatis.mapper-locations=classpath*:mappers/*.xml
mybatis.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl
# freemarker页面配置
spring.mvc.static-path-pattern=/static/**
spring.freemarker.cache=false
spring.freemarker.suffix=.html
spring.freemarker.charset=utf-8
spring.freemarker.check-template-location=true
spring.freemarker.content-type=text/html
spring.freemarker.expose-request-attributes=false
spring.freemarker.expose-session-attributes=false
spring.freemarker.request-context-attribute=request
# 下面这句不加的话http://localhost:8080/swagger-ui.html访问报错404
spring.resources.static-locations=classpath:/static/
# swagger
#swagger.base-package=com.jason.layout
#logging.level.root=debug
#spring.redis.host=39.108.187.144
#spring.redis.port=6379

#spring.devtools.restart.enabled=true
#spring.devtools.restart.exclude=static/**,public/**
#spring.devtools.restart.additional-paths=src/main/java


管理员账号admin 密码 admin

学生账号student 密码 student

老师账号 teacher密码 teacher
