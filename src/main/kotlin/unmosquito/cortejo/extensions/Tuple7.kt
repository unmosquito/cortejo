package unmosquito.cortejo.extensions

import unmosquito.cortejo.Tuple7
import unmosquito.cortejo.value.Tuple7Value

/**
 * Create a septuple.
 *
 * @param t1 first value of tuple
 * @param t2 second value of tuple
 * @param t3 third value of tuple
 * @param t4 fourth value of tuple
 * @param t5 fifth value of tuple
 * @param t6 sixth value of tuple
 * @param t7 seventh value of tuple
 *
 * @return tuple of size 7
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
@Suppress("LongParameterList")
fun <T1, T2, T3, T4, T5, T6, T7> tuple7(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7):
    Tuple7<T1, T2, T3, T4, T5, T6, T7> = Tuple7Value(t1, t2, t3, t4, t5, t6, t7)

/**
 * Returns seventh element of tuple.
 * Delegates to [Tuple7.component7].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
@Suppress("TopLevelPropertyNaming")
val <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7>._7: T7
    get() = this.component7()

/**
 * Returns seventh element of tuple.
 * Delegates to [Tuple7.component7].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
val <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7>.seventh: T7
    get() = this.component7()
