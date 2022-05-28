package com.example.kotlinpractice

fun main() {
    checkNum(1)
    helloWorld()

    println(add(4, 5)) // 강의에서는 a:4, b:5 로 콜론인데 왜 여기선 안되지
    // 아 콜론을 사용한게아니라 그냥 파라미터에 (4,5) 요로케 넣어주면 자동으로 저게 생김
    // println(add(a=4,b=5)) 이방식도 계산은 되는데..

    //3. String Template
    val name = "hyeongjin"
    val lastname = "Kim"
    println("my name is ${name} and I'm 29 ") // 변수사용
    println("my name is ${name + lastname} and I'm in korea")
    // println("this is 2$a")
    println("this is 2\$a")
    // 문자앞에 백슬래시 넣으면 무조건 문자로 인식함 $ 기호 사용의 예
}

// 1. 함수
fun helloWorld () { //return type 이 없는 경우에는 : Unit을 생략해도 된다. = redundant다.
    println("Hello World!")
}
//java나 c언어와 다른점은 변수가 뒤에온다는점 = 변수 이름 변수타입 순
fun add (a : Int, b : Int) : Int { // 파라미터 a의 타입설정, 파라미터 b의 타입 설정, 리턴타입의 설정, 변수타입 첫번째 대문자!
    // return type 이 있으니까 콜론 즉, Unit을 생략하면 안됨
    return a+b
}

// 2. val vs var
// val = value : 값, 바뀌지않음, 재할당 불가능
// var = variable : 변수, 바뀜, 재할당 가능

fun hi() {
    val a : Int = 10
    var b : Int = 9

    b = 100
    // 바로 할당할 때에는 변수타입을 자동추론하지만, 바로 할당하지 않을 때에는 변수타입을 선언해야함.
    val c = 100
    var d = 100

    var name : String = "hyeongjin"
}

//4. 조건식

fun maxBy(a : Int, b : Int) : Int {
    if(a > b){
        return a
    }else {
        return b
    }
}
fun maxBy2(a : Int, b : Int) :Int = if(a>b) a else b //위의 식과 같다

fun checkNum(score : Int) {
    println("b : ${b}")
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("i don't know")
    }
    var b : Int = when(score) {
        1->1
        2->2
        else -> 3
    }
    when(score) {
        in 90..100 -> println("You are genius")
        in 1..80 -> println("너 바부야?")
        else -> println("not bad")
    }
}


