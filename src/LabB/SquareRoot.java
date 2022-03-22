/**
 * Class that squareroots a number
 */
package LabB;

/**
 * SquareRoot class
 */
public class SquareRoot implements OpClass {

    /**
     * method takes object, casts it to a Number, square-roots it, then returns it
     * @param arg supplies objec to method
     * @return returns a Double obj (subclass of Number)
     */
    @Override
    public Object op(Object arg) {

        Number num = (Number)arg;

        return Math.sqrt(num.doubleValue());
    }
}
