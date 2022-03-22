/**
 * Class that cubes a number
 */
package LabB;

/**
 * Cube class
 */
public class Cube implements OpClass {

    /**
     * method takes object, casts it to a Number, cubes it, then returns it
     * @param arg supplies object to method
     * @return returns a Double obj (subclass of Number)
     */
    @Override
    public Object op(Object arg) {

        Number num = (Number)arg;

        return Math.pow(num.doubleValue(),3);
    }

}
