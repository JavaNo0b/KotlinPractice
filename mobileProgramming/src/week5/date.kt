package week5

import java.text.SimpleDateFormat
import java.util.*

fun main(){
    var now = Date()
    var sFormat : SimpleDateFormat

    sFormat = SimpleDateFormat("yyyyMMdd")
    println(sFormat.format(now)) // 20201212 형식으로 출력

    sFormat = SimpleDateFormat("HH:mm::ss")
    println(sFormat.format(now)) // 23:15:21 형식으로 출력
}