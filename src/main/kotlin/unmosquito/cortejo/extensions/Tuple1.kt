package unmosquito.cortejo.extensions

import unmosquito.cortejo.Tuple1
import unmosquito.cortejo.value.Tuple1Value

/**
 * Create a single value tuple.
 *
 * @param t1 first value of tuple
 *
 * @return tuple of size 1
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
fun <T1> tuple1(t1: T1): Tuple1<T1> = Tuple1Value(t1)

/**
 * Returns first element of tuple.
 * Delegates to [Tuple1.component1].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
@Suppress("TopLevelPropertyNaming")
val <T1> Tuple1<T1>._1: T1 get() = this.component1()

/**
 * Returns first element of tuple.
 * Delegates to [Tuple1.component1].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
val <T1> Tuple1<T1>.first: T1 get() = this.component1()
