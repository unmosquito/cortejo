package unmosquito.cortejo

/**
 * A 3-tuple (triple).
 *
 * @param T1 type of first element of tuple.
 * @param T2 type of second element of tuple.
 * @param T3 type of third element of tuple.
 * @author Dmitry Komarov <komarovdmitry1995@gmail.com>
 * @since 23.03.2018
 */
interface Tuple3<out T1, out T2, out T3> : Tuple2<T1, T2> {

    override val arity: Int get() = 3

    /**
     * Returns third element of tuple.
     *
     * @return third element
     */
    operator fun component3(): T3

}
