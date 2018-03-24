package unmosquito.cortejo.concat

import unmosquito.cortejo.Tuple1
import unmosquito.cortejo.Tuple2

/**
 * Creates a tuple of size 2 by concatenating 1-tuple and single value.
 *
 * @property tuple1 representing a 1-tuple
 * @property value representing a second element of tuple/
 * @param T1 type of first element of tuple
 * @param T2 type of second element of tuple
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
class Tuple2Concat<out T1, out T2>(private val tuple1: Tuple1<T1>, private val value: T2) :
    Tuple2<T1, T2> {

    override fun component1(): T1 = tuple1.component1()

    override fun component2(): T2 = value

}