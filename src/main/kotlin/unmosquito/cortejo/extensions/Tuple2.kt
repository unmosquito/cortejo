package unmosquito.cortejo.extensions

import unmosquito.cortejo.Tuple2
import unmosquito.cortejo.value.Tuple2Value

/**
 * Create a double value tuple.
 *
 * @param t1 first value of tuple
 * @param t2 second value of tuple
 *
 * @return tuple of size 2
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
fun <T1, T2> tuple2(t1: T1, t2: T2): Tuple2<T1, T2> = Tuple2Value(t1, t2)

/**
 * Returns second element of tuple.
 * Delegates to [Tuple2.component2].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
@Suppress("TopLevelPropertyNaming")
val <T1, T2> Tuple2<T1, T2>._2: T2 get() = this.component2()

/**
 * Returns second element of tuple.
 * Delegates to [Tuple2.component2].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
val <T1, T2> Tuple2<T1, T2>.second: T2 get() = this.component2()
