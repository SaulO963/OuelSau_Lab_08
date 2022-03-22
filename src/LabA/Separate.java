/**
 * refer to Main
 */
package LabA;

/**
 * Separate class only inherits from IType.
 */
public class Separate implements IType{

    private static int m1Count = 0;

    /**
     * Separate constructor - prints message when called
     */
    public Separate(){
        System.out.println("Separate Constructor");
    }

    /**
     * m1 method same as Base class - keeps track of universal m1 calls from Separate objects
     */
    public void m1(){
        m1Count++;
        System.out.println("m1Count: " + m1Count);
    }

    /**
     * m2 method overridden from IType interface - prints given String and call location
     * @param s supplies String to method
     */
    @Override
    public void m2(String s) {
        System.out.println(s + " from Separate.");
    }

    /**
     * method prints where it is called from
     */
    @Override
    public void m3() {
        System.out.println("Separate.m3");
    }
}
