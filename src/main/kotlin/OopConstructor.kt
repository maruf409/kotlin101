package org.home

class OopConstructor(val id: Int, var param1: Int, var param2: String) {

    // 1. Keep the init block empty or remove it completely
    // so nothing runs automatically upon creation.

/*    init {
        methodOne()
        methodTwo()
    }*/

    fun methodOne() {

        if (id > 10){
            println("id is greater than 10")
        }else if (id < 0){
            println("id is less than 0")
        }
    }

    fun methodTwo() {
        if (param1 == 0){
            println("param1 is zero and its comes from methodTwo")
        }else if (param1 == 1){
            println("param1 is one and its comes from methodTwo")
        }
    }

    fun methodThree(score: Int): OopConstructor {
        if (score > id){
            println("score is greater than id")
        }else if (score < 0){
            println("score is less than 0")
        }
        return this
    }

    fun methodFour( name : String): OopConstructor {

        println(" $name is $param2")
        return this
    }
}