package unmosquito.cortejo

/**
 * Tuple is a finite ordered sequence of values. This interface is a marker for other n-tuples.
 * Cortejo implements 0- to 7-tuples.
 *
 * @author Dmitry Komarov <komarovdmitry1995@gmail.com>
 * @since 23.03.2018
 */
interface Tuple {

    /**
     * Size of tuple.
     */
    val arity: Int

}
