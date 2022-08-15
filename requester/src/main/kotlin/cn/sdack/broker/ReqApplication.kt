package cn.sdack.broker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReqApplication

fun main(args: Array<String>) {
    runApplication<ReqApplication>(*args)
}
