package unmosquito.cortejo.extensions

import unmosquito.cortejo.Tuple6
import unmosquito.cortejo.value.Tuple6Value

/**
 * Create a sextuple.
 *
 * @param t1 first value of tuple
 * @param t2 second value of tuple
 * @param t3 third value of tuple
 * @param t4 fourth value of tuple
 * @param t5 fifth value of tuple
 * @param t6 sixth value of tuple
 *
 * @return tuple of size 6
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
@Suppress("LongParameterList")
fun <T1, T2, T3, T4, T5, T6> tuple6(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6):
    Tuple6<T1, T2, T3, T4, T5, T6> = Tuple6Value(t1, t2, t3, t4, t5, t6)

/**
 * Returns sixth element of tuple.
 * Delegates to [Tuple6.component6].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
@Suppress("TopLevelPropertyNaming")
val <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6>._6: T6
    get() = this.component6()

/**
 * Returns sixth element of tuple.
 * Delegates to [Tuple6.component6].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
val <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6>.sixth: T6
    get() = this.component6()
