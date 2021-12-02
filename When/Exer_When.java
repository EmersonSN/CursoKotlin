/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun categoria(peso:Int):String{
    when (peso){
        in 0.. 56 ->{
            return "O peso informado é ${peso} a categoria é Pena"
        }
        in 57..60 ->{
            return "O peso informado é ${peso} a categoria é Leve"
        }
        in 61..72 ->{
            return "O peso informado é ${peso} a categoria é Médio"
        }else ->{
            return "O peso informado é ${peso} a categoria é Pesado"
        }
    }
}
fun operacoes(a:Int, b:Int, c:String):Int{
    when (c){
        "Soma" ->{
            return a + b;
        }
        "Subtração" ->{
            return a - b;
        }
        else ->{
            return 0;
        }
    }
}
fun main(){
    println(categoria(75));

    println(operacoes(10,20,"Soma"));
    println(operacoes(10,40,"Subtração"));
}