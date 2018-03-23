package unmosquito.cortejo

/**
 * A 4-tuple (quadruple).
 *
 * @param T1 type of first element of tuple.
 * @param T2 type of second element of tuple.
 * @param T3 type of third element of tuple.
 * @param T4 type of fourth element of tuple.
 * @author Dmitry Komarov <komarovdmitry1995@gmail.com>
 * @since 23.03.2018
 */
interface Tuple4<out T1, out T2, out T3, out T4> : Tuple3<T1, T2, T3> {

    override val arity: Int get() = 4

    /**
     * Returns fourth element of tuple.
     *
     * @return fourth element
     */
    operator fun component4(): T4

}
