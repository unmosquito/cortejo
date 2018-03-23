package unmosquito.cortejo.value

import unmosquito.cortejo.Tuple6

/**
 * A simple and immutable representation of sextuple.
 *
 * @property t1 represents a first element of tuple
 * @property t2 represents a second element of tuple
 * @property t3 represents a third element of tuple
 * @property t4 represents a fourth element of tuple
 * @property t5 represents a fifth element of tuple
 * @property t6 represents a sixth element of tuple
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
data class Tuple6Value<out T1, out T2, out T3, out T4, out T5, out T6>(
    val t1: T1,
    val t2: T2,
    val t3: T3,
    val t4: T4,
    val t5: T5,
    val t6: T6
) : Tuple6<T1, T2, T3, T4, T5, T6>
