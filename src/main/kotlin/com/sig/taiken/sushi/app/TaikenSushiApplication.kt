package com.sig.taiken.sushi.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaikenSushiApplication

fun main(args: Array<String>) {
	runApplication<TaikenSushiApplication>(*args)
}
