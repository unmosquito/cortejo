package unmosquito.cortejo.value

import unmosquito.cortejo.Tuple1

/**
 * A simple and immutable representation of single value tuple.
 *
 * @property t1 represents a first element of tuple
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
data class Tuple1Value<out T1>(val t1: T1) : Tuple1<T1>
