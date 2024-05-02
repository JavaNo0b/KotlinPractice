package week4// 전역변수 : 선언과 동시에 초기화를 시켜야한다.

var myVar : Int = 100

fun main(){
    var myVar: Int = 0
    println(myVar)

    var sum : Int = addFunction(10,20)
    println(sum)
}

fun addFunction(num1: Int, num2: Int): Int {
    var hap : Int
    hap = num1 + num2 + myVar
    return hap
}