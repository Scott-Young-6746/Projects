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
            PIPair(1, 3),
            PIPair(2, 1),
            PIPair(3, 4),
            PIPair(4, 1),
            PIPair(5, 5),
            PIPair(6, 9))
    test_cases.forEach{
        assert("it.value: ${it.value} == nth_digit(it.pos): ${nth_digit(it.pos)}",
                it.value == nth_digit(it.pos))
    }
    test_cases.forEach{
        assert("it.value: ${it.value} == nth_digit(it.pos): ${safe_nth_digit(it.pos).second}",
                it.value == safe_nth_digit(it.pos).second)
    }
    assert("it.value: 17 == nth_digit(it.pos): ${safe_nth_digit(17).second}",
            17 == safe_nth_digit(17).second)
}