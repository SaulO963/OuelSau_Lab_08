/**
 * Inheritance class that describes our op (operator) method
 */
package LabB;

/**
 * OpClass interface
 */
public interface OpClass {
    /**
     * blueprint to be derived from different operator classes
     * @param arg supplies arg obj to function
     * @return returns a Number class object
     */
    abstract Object op(Object arg);
}
