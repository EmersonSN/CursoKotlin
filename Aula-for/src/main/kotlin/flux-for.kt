fun main(args: Array<String>) {
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
    println("""""")
    for (i in 1..10){
        print(i)
    }
}