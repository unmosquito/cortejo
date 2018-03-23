package unmosquito.cortejo.extensions

import unmosquito.cortejo.Tuple4
import unmosquito.cortejo.value.Tuple4Value

/**
 * Create a quadruple.
 *
 * @param t1 first value of tuple
 * @param t2 second value of tuple
 * @param t3 third value of tuple
 * @param t4 fourth value of tuple
 *
 * @return tuple of size 4
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
fun <T1, T2, T3, T4> tuple4(t1: T1, t2: T2, t3: T3, t4: T4): Tuple4<T1, T2, T3, T4>
    = Tuple4Value(t1, t2, t3, t4)

/**
 * Returns fourth element of tuple.
 * Delegates to [Tuple4.component4].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
@Suppress("TopLevelPropertyNaming")
val <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4>._4: T4 get() = this.component4()

/**
 * Returns fourth element of tuple.
 * Delegates to [Tuple4.component4].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
val <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4>.fourth: T4 get() = this.component4()
