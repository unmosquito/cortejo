package unmosquito.cortejo.extensions

import unmosquito.cortejo.Tuple5
import unmosquito.cortejo.value.Tuple5Value

/**
 * Create a quintuple.
 *
 * @param t1 first value of tuple
 * @param t2 second value of tuple
 * @param t3 third value of tuple
 * @param t4 fourth value of tuple
 * @param t5 fifth value of tuple
 *
 * @return tuple of size 5
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
fun <T1, T2, T3, T4, T5> tuple5(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): Tuple5<T1, T2, T3, T4, T5>
    = Tuple5Value(t1, t2, t3, t4, t5)

/**
 * Returns fifth element of tuple.
 * Delegates to [Tuple5.component5].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
@Suppress("TopLevelPropertyNaming")
val <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5>._5: T5
    get() = this.component5()

/**
 * Returns fourth element of tuple.
 * Delegates to [Tuple5.component5].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
val <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5>.fifth: T5
    get() = this.component5()
