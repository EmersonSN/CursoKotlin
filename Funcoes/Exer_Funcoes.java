/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun calcular(x:Int, y:Int, z:Int){
    println("O bônus é: ${x+y*z}");
}
fun hello(nome:String):String{
    return "Olá, ${nome}"
}
fun hello2(nome:String) = "Olá, ${nome}"
fun contar(nome:String) = "A string ${nome} possui ${nome.length} caracteres"
/*FUNÇÃO MAIN()*/
fun main() {
    println("Olá, mundo!");
    println(hello("Emerson"))
    println(hello2("Emersin"))
    println(contar("Emerson"))
    
    var nome:String = "Emerson";
    nome = "Emerson Santos"
    var idade:Int = 23;
    var valor:Float = 21.8f;
    
    var a1 = "oi";
    var a2 = "sim ${a1}";
    val a = 10;
    val b = 20;
    val c = 30;
    calcular(a,b,c);
    
    println(a2);
    
    println(nome +" "+ idade+" "+ valor)
}