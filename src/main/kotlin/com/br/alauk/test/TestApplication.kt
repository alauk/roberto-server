package com.br.alauk.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestApplication

fun main(args: Array<String>) {
	print("Hello World!")
	runApplication<TestApplication>(*args)
}
