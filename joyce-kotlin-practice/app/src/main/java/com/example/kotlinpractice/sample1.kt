package com.example.kotlinpractice

fun main() {
    helloWorld()

    println(add(4,5)) // 강의에서는 a:4, b:5 로 콜론인데 왜 여기선 안되지
    // 아 콜론을 사용한게아니라 그냥 파라미터에 (4,5) 요로케 넣어주면 자동으로 저게 생김
    // println(add(a=4,b=5)) 이방식도 계산은 되는데..
}

// 1. 함수

fun helloWorld () { //return type 이 없는 경우에는 : Unit을 생략해도 된다. = redundant다.
    println("Hello World!")
}

//java나 c언어와 다른점은 변수가 뒤에온다는점 = 변수 이름 변수타입 순
fun add (a : Int, b : Int) : Int { // 파라미터 a의 타입설정, 파라미터 b의 타입 설정, 리턴타입의 설정, 변수타입 첫번째 대문자!
    return a+b
}

