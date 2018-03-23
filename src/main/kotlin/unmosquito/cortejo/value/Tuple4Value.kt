package unmosquito.cortejo.value

import unmosquito.cortejo.Tuple4

/**
 * A simple and immutable representation of quadruple.
 *
 * @property t1 represents a first element of tuple
 * @property t2 represents a second element of tuple
 * @property t3 represents a third element of tuple
 * @property t4 represents a fourth element of tuple
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
data class Tuple4Value<out T1, out T2, out T3, out T4>(
    val t1: T1,
    val t2: T2,
    val t3: T3,
    val t4: T4
) : Tuple4<T1, T2, T3, T4>
