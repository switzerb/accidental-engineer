package com.brennaswitzer

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.brennaswitzer")
		.start()
}

