package org.home

import java.util.Collections.list

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, $name!")

    /*    for (i in 1..5) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            println("i = $i")
        }*/

    val positiveNumber = 10;
    val negativeNumber = -10;
    val stringNumber = "welcome";
    val decimalNumber = 10.00;

    var sentence = "Bangladesh is populated country";
    sentence = "override first sentence";

    val x= 19000000
    var sentence2 = "Bangladesh population is nearly $x and women almost ${60 * 90}";

    println(positiveNumber);
    println(negativeNumber);
    println(stringNumber);
    println(decimalNumber);
    println(sentence);
    println(sentence2);


    val acondition = 5 > 6;

    /* conditional operation*/

    if (acondition){
        println("condition statement is false")
    }else{
        println("condition statement is true")
    }

    val secondCondition = if (acondition) 1 else 2
    println(secondCondition);

    when (secondCondition) {
        1 -> println("1 condition is false")
        2 -> println("2 condition is true")
        3 -> println("3 condition is false")
        else -> println("invalid condition")
    }

    /*todo loop iteration*/
    val alist = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (item in alist) {
        println(item)
    }

    for(item  in 1 ..10 step 2) {
        println(item)
    }

    /*function*/

    /*fun functionName(parameter1: Type, parameter2: Type): ReturnType {
    // Function body
    return value
}
    *
    * */

    fun addNumbers(num1: Int, num2: Int): Int {
        return num1 + num2;
    }

    println(addNumbers(2,2))

    fun displayName(str: String): /*Unit*/ String {
        return "welcome to Bangladesh" + str
//        println("Welcome to $str")
    }

    println(displayName(" Maruf"))

    fun configuration(param1: Int,param2: Int= 56,param3: String="Bangladesh"): String {

        return param1.toString() + param2.toString() + param3
    }

    println(configuration(4,5))


    fun concatStrings(param1: String,param2: Int,param3: Double=10.00): String {

        var result = ""

        for(i in 1 .. param3.toInt()){
            result += i.toString() + param2.toString()
        }

        return result
    }

    println(concatStrings("together",12))

    val method1 = LearnOop()
    println(method1.initial)
    println(method1.oop1(5,6))


//    val oopCons = OopConstructor(1,2,"maruf from constructor")

//    println(oopCons.param2)

    val oopCons = OopConstructor(12,0,"from Bangladesh")

    oopCons.methodOne()
    oopCons.methodThree(14)
    oopCons.methodFour("ahmed")

    val oopIn = OopInheritance2("bangladesh","dhaka","dhanmond",23)

    println(oopIn.personDetails())










//    collectionsLearning()





}