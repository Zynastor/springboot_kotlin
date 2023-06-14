package com.zynastor.firstboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class FirstbootApplication {

}

fun main(args: Array<String>) {
    runApplication<FirstbootApplication>(*args)
}
