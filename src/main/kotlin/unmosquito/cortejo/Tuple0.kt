package unmosquito.cortejo

/**
 * A 0-tuple (empty tuple).
 *
 * @author Dmitry Komarov <komarovdmitry1995@gmail.com>
 * @since 23.03.2018
 */
interface Tuple0 : Tuple {

    override val arity: Int get() = 0

}
