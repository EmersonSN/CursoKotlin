/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */


/*FUNÇÃO MAIN()*/
fun main() {
    val str = "Emerson Santos";
    for(c in str){
        print("$c-")
    }
    println("""""")
    for (i in 1..100){
        print(" $i");
        if(i == 10 || i == 20 || i==100){
            println("""""")
        }
    }
    for (j in 100 downTo 1){
        print("$j ")
    }
    ar i:Int = 0;
    while (i<3){
        println(i);
        i++;
    }
    var j:Int = 10;
    do {
        println(j);
    }while (j > 100)
}