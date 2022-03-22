/**
 * Class that squares a number
 */
package LabB;

import java.lang.Math;

/**
 * Square class
 */
public class Square implements OpClass {

    /**
     * method takes object, casts it to a Number, squares it, then returns it
     * @param arg supplies object to method
     * @return returns a Double obj (subclass of Number)
     */
    @Override
    public Object op(Object arg) {

        Number num = (Number)arg;

        return Math.pow(num.doubleValue(),2);
    }
}
