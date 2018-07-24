package com.example.greetings

import org.springframework.context.annotation.Profile
import org.springframework.web.bind.annotation.*
import java.util.*


//@Profile(value = ["default", "insecure"])
@RestController
@RequestMapping(method = [RequestMethod.GET], value = "/greet/{name}")
class DefaultGreetingsRestController {
    @RequestMapping
    fun hi(@PathVariable name: String): Map<String, String> {
        return Collections.singletonMap("greeting", "hello, $name!")
    }
}