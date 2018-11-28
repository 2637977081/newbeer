#email 邮箱配置
邮箱配置发送方最好使用 新浪、网易 等，避免使用 腾讯邮箱
###application.yml
```properties
  mail:
    host: smtp.sina.com
    username: catcoder@sina.com
    password: *****
    properties:
      mail:
        smtp:
          auth: true
          connectiontimeout: 5000
          timeout: 3000
          writetimeout: 5000
          socketFactory:
            class: javax.net.ssl.SSLSocketFactory
            fallback: false
            port: 465
```
###pom.xml
```properties
<!-- email 支持-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context-support</artifactId>
            <version>5.0.8.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>com.sun.mail</groupId>
            <artifactId>javax.mail</artifactId>
            <version>1.6.1</version>
        </dependency>
```
