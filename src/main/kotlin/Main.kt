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




    /*loop operation*/







//    collectionsLearning()





}