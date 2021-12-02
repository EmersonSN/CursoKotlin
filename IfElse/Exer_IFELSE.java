fun abacaxi (a:Int):String{
    if(a < 10){
        return "Valor total ${a * 3}";
    }else{
        return "Valor total ${a * 2}";
    }
}
fun qualMaior(a:Int,b:Int):String{
    if(a>b){
        return "A primeira variavel, ${a} é maior";
    }else if(a==b){
        return "O primeiro ${a} e segundo valor ${b} são iguais";
    }
    else{
        return "A segunda variavel, ${b} é maior";
    }
}
fun verificaIdade(idade:Int){
    if(idade >=18){
        println("Por você ter ${idade} anos, você é maior de idade")
    }else{
        println("Por você ter ${idade} anos, você é menor de idade")
    }
}
fun calcularBonus(cargo:String, salario:Float) : Float{
    val bonus:Float
    if(cargo == "Coordenador"){
        bonus = salario * 1.2f;
    }else if(cargo == "Gerente Junior"){
        bonus = salario * 1.5f;
    }else{
        bonus = salario * 3f;
    }
    return bonus;
}
fun main(){
    println(abacaxi(8));
    println(qualMaior(10,10));
    verificaIdade(20);

    println(calcularBonus("Coordenador", 100f));
    println(calcularBonus("Gerente Junior", 100f));
    println(calcularBonus("Gerente Senior", 100f));

}