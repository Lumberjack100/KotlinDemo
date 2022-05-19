package com.shmedo.kotlindemo

/**
 * 创建者:   gonghe <br/>
 * 创建时间:  2022/4/11 <br/>
 * 描述：     TODO
 */
fun main() {
    println("Hello World")
//    val value= largeNumber(3,5)
//    println("largeNumber is $value")

    val value = getScore("Tom")
    println("getScore is $value")
}

fun largeNumber(num1: Int, num2: Int): Int {
    val value = if (num1 > num2) {
        num1
    } else {
        num2
    }
    return value;
}

fun getScore(name: String) = when (name) {
    "Tom" -> 93
    "Jack" -> 80
    "Bob" -> 88
    else -> 90
}