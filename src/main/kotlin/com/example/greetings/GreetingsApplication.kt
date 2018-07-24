package com.example.greetings

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient /* 서비스등록 및 탐색을 위해서는 해당 어노테이션이 필요한데, 스프링클라우드 및 Eureka client 의존함 */
@SpringBootApplication
class GreetingsApplication

/* greeting-service */
fun main(args: Array<String>) {
    runApplication<GreetingsApplication>(*args)
}
