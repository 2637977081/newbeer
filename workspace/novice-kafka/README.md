#kafka 配置
配置kafka服务教程
http://kafka.apache.org/quickstart

###application.yml
```properties
spring
  cloud:
     stream:
        default:
          group: service
          contentType: application/json
          binder: kafka
          consumer:
            concurrency: 1 #消费者并发数
            partitioned: true
          producer:
            partitionKeyExpression: payload.id
            partitionCount: 1 #分区数
        instanceCount: 3 #微服务实例数
        kafka:
          binder:
            brokers: 192.168.152.129:9092
            replicationFactor: 1 #备份数
            autoAddPartitions: true
            autoCreateTopics: true
        bindings:
          task-input:
            destination: test
          task-output:
            destination: test
```
###pom.xml
```properties
<!-- kafka客户端依赖 -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-stream-kafka</artifactId>
            <version>2.0.1.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-stream</artifactId>
            <version>2.0.1.RELEASE</version>
        </dependency>
```