fun assert(str: String, predicate: Boolean){
    if(!predicate){
        println("test \"$str\" failed")
    }
}

fun test(){
    nth_digit_test()
}

data class PIPair(val pos: Int, val value: Int)

fun nth_digit_test(){
    val test_cases = listOf(
            PIPair(0, 3),
            PIPair(1, 1),
            PIPair(2, 4),
            PIPair(3, 1),
            PIPair(4, 5),
            PIPair(5, 9))
    test_cases.forEach{
        assert("it.value: ${it.value} == nth_digit(it.pos): ${nth_digit(it.pos)}",
                it.value == nth_digit(it.pos))
    }
}