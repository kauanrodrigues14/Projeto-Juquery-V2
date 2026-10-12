package org.example.projetojuquery_v2

import kotlin.random.Random

class Greeting {
    private val platform = getPlatform()

    fun greet(): List<String> = buildList {
        add (if(Random.nextBoolean())"'Hi " else "hello ")
        add("guest! I'm running on $platform.")

    }
}