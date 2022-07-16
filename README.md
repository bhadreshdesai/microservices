# microservices

## Create projects

### Create the root project
```shell
gradle init --type basic --dsl groovy --project-name microservices
```

### Create the customer-service project
```shell
curl https://start.spring.io/starter.tgz \
    -d type=gradle-project \
    -d language=java \
    -d javaVersion=17 \
    -d groupId=bdd.microservices \
    -d artifactId=customer-service \
    -d name=customer-service \
    -d dependencies=data-jpa,devtools,lombok,h2,web \
| tar -xzv --one-top-level=customer-service
```

### Create the product-service project
```shell
curl https://start.spring.io/starter.tgz \
    -d type=gradle-project \
    -d language=java \
    -d javaVersion=17 \
    -d groupId=bdd.microservices \
    -d artifactId=product-service \
    -d name=product-service \
    -d dependencies=data-mongodb,devtools,lombok,web \
| tar -xzv --one-top-level=product-service
```

### Create the inventory-service project
```shell
curl https://start.spring.io/starter.tgz \
    -d type=gradle-project \
    -d language=java \
    -d javaVersion=17 \
    -d groupId=bdd.microservices \
    -d artifactId=inventory-service \
    -d name=inventory-service \
    -d dependencies=data-jpa,devtools,lombok,h2,web \
| tar -xzv --one-top-level=inventory-service
```

### Create the order-service project
```shell
curl https://start.spring.io/starter.tgz \
    -d type=gradle-project \
    -d language=java \
    -d javaVersion=17 \
    -d groupId=bdd.microservices \
    -d artifactId=order-service \
    -d name=order-service \
    -d dependencies=data-jpa,devtools,lombok,h2,web \
| tar -xzv --one-top-level=order-service
```

Include product-service in the root project by adding `include 'product-service'` to [settings.gradle](./settings.gradle)

## References
[Spring Boot Microservices Project Example - Part 1 | Building Services](https://www.youtube.com/watch?v=lh1oQHXVSc0)
[spring-boot-microservices-new github](https://github.com/SaiUpadhyayula/spring-boot-microservices-new)

curl https://start.spring.io/starter.tgz \
    -d type=gradle-project \
    -d language=java \
    -d javaVersion=17 \
    -d groupId=bdd.microservices \
    -d artifactId=order-service \
    -d name=order-service \
    -d dependencies=data-jpa,devtools,lombok,h2,web \
| tar -xzv --one-top-level=order-service