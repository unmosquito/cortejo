package unmosquito.cortejo

/**
 * A 5-tuple (quintuple).
 *
 * @param T1 type of first element of tuple.
 * @param T2 type of second element of tuple.
 * @param T3 type of third element of tuple.
 * @param T4 type of fourth element of tuple.
 * @param T5 type of fifth element of tuple.
 * @author Dmitry Komarov <komarovdmitry1995@gmail.com>
 * @since 23.03.2018
 */
interface Tuple5<out T1, out T2, out T3, out T4, out T5> : Tuple4<T1, T2, T3, T4> {

    override val arity: Int get() = 5

    /**
     * Returns fifth element of tuple.
     *
     * @return fifth element
     */
    operator fun component5(): T5

}
