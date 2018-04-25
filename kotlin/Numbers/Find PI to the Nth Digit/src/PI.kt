import com.sun.tools.corba.se.idl.InvalidArgument

fun nth_digit(n: Int): Int =
        (Math.PI * (Math.pow(10.0, (n-1).toDouble()))).toInt() % 10

fun safe_nth_digit(n: Int): Pair<InvalidArgument?, Int?> =
        if(n>16) {
            Pair(InvalidArgument("Digit $n higher than supported 16"), null)
        } else {
            Pair(null, nth_digit(n))
        }
