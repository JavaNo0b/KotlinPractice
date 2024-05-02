//fun main() {
//    var one : IntArray = intArrayOf(10,20,30)
//    for(i in one.indices) {
//        println(one[i])
//    }
//    for (value in one) {
//        println(value)
//    }
//    var two : Array<String> = arrayOf("하나", "둘", "셋")
//    for (i in 0..2 step 2){
//        println(two[i])
//    }
//    var k : Int = 0
//    while (k < two.size){
//        println(two[k])
//        k++
//    }
//}
//    var var1: Int = 10
//    var var2: Float = 10.1f
//    var var3: Double = 10.2
//    var var4: Char = '안'
//    var var5: String = "안드로이드"
//
//    println(var1)
//    println(var2)
//    println(var3)
//    println(var4)
//    println(var5)
//
//    var var11 = 10
//    var var22 = 10.1f
//    var var33 = 10.2
//    var var44 = '안'
//    var var55 = "안드로이드"
//
//    println(var11)
//    println(var22)
//    println(var33)
//    println(var44)
//    println(var55)
//    println("---------------------------")
//
//
//// var : 재선언, 재할당 가능, val : 재선언, 재할당 불가능
//
//    var myVar : Int = 100
//    myVar = 200
//    println(myVar)
//
//    val myVal : Int = 100
////    myVal = 200 // 오류
//    println(myVal)
//    println("---------------------------")
//
//    var a : Int = "100".toInt()
//    var b : Double = "100.123".toDouble()
//
////    var notNull : Int = null // 오류
//    var okNull : Int? = null // ?: 널도 받아들임
//
//    var ary = ArrayList<Int>(1)
//    ary!!.add(100)
//    println(ary)
//    println("---------------------------")
//
//    var count: Int = 85
//    if(count >= 90){
//        println("if문: 합격")
//    } else if(count >= 60){
//        println("if문: 합격")
//    } else{
//        println("if문: 불합격")
//    }
//
//    var jumsu : Int = (count / 10) * 10
//    when (jumsu) {
//        100 -> println("when문: 합격(장학생)")
//        90 -> println("when문: 합격(장학생)")
//        80, 70, 60 -> println("when문: 합격")
//        else -> println("when문: 불합격")
//
//    }
//    println("---------------------------")
//
//    jumsu = count
//    when(jumsu){
//        in 90..100 -> println("when문: 합격(장학생)")
//        in 60..89 -> println("when문: 합격")
//        else -> println("when문: 불합격")
//    }
//    println("---------------------------")
//
//    var one  = Array<Int>(4,{0})
//    one[0] = 10
//    one[3] = 20
//    for (i in one) {
//        println(i)
//    }
//    println("---------------------------")
//
//    var two  = Array<IntArray>(3,{IntArray(4)}) // 3행 4열
//    two[0][0] = 100
//    two[2][3] = 200
//    for (i in two) {
//        for (j in i){
//            println(j)
//        }
//    }
//    println("---------------------------")
//
//    var three : IntArray  = intArrayOf(1,2,3)
//    for (i in three) {
//        println(i)
//    }
//    println("---------------------------")
//
//    var one1 = ArrayList<Int>(4)
//    one1.add(10)
//    one1.add(20)
//    var hap = one.get(0) + one.get(1)
//    println(hap)
//    println("---------------------------")
//
//    var one2 : IntArray = intArrayOf(10,20,30,40)
//    for (i in one2.indices){
//        println(one2[i])
//    }
//    println("---------------------------")
//
//    var one3 : IntArray = intArrayOf(10,20,30)
//    for(i in one3.indices) {
//        println(one3[i])
//    }
//    for (value in one) {
//        println(value)
//    }
//    var two2 : Array<String> = arrayOf("하나", "둘", "셋")
//    for (i in 0..2 step 2){
//        println(two2[i])
//    }
//    var k : Int = 0
//    while (k < two2.size){
//        println(two2[k])
//        k++
//    }
//    println("---------------------------")
//
//    var five  = Array<Int>(4,{0})
//    one[0] = 10
//    one[3] = 20
//    println(five.contentToString())
//    println("---------------------------")
//
//}