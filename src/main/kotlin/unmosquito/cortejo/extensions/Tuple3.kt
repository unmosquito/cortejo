package unmosquito.cortejo.extensions

import unmosquito.cortejo.Tuple3
import unmosquito.cortejo.value.Tuple3Value

/**
 * Create a triple value tuple.
 *
 * @param t1 first value of tuple
 * @param t2 second value of tuple
 * @param t3 third value of tuple
 *
 * @return tuple of size 3
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
fun <T1, T2, T3> tuple3(t1: T1, t2: T2, t3: T3): Tuple3<T1, T2, T3> = Tuple3Value(t1, t2, t3)

/**
 * Returns third element of tuple.
 * Delegates to [Tuple3.component3].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
@Suppress("TopLevelPropertyNaming")
val <T1, T2, T3> Tuple3<T1, T2, T3>._3: T3 get() = this.component3()

/**
 * Returns third element of tuple.
 * Delegates to [Tuple3.component3].
 *
 * @author Dmitry Komarov <dmitrykomarov1995@gmail.com>
 * @since 23.03.2018
 */
val <T1, T2, T3> Tuple3<T1, T2, T3>.third: T3 get() = this.component3()
