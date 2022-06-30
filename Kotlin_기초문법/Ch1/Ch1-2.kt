// 함수를 선언할 때 fun 이라 씀
// // 코틀린은 이렇게 변수 Type 지정 / 변수 n1는 int, 변수 n2는  int
// add():Int 이런 식으로 반환값 또한 int 형으로 지정할 수 있다.

fun add(n1: Int, n2: Int):Int{
    return n1 + n2
}

fun main() {
   	println(add(2,4)) // add함수(매개변수 2개 2,4)
}
// 출력 결과 : 6