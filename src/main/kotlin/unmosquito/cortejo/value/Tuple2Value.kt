package unmosquito.cortejo.value

import unmosquito.cortejo.Tuple2

/**
 * A simple and immutable representation of double value tuple.
 *
 * @property t1 represents a first element of tuple
 * @property t2 represents a second element of tuple
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
data class Tuple2Value<out T1, out T2>(val t1: T1, val t2: T2) : Tuple2<T1, T2>
