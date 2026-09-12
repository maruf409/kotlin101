package org.home

open class OopInheritance(val name: String, var age: Int) {

    open fun personDetails() {
        println("$name is $age")
    }
}
