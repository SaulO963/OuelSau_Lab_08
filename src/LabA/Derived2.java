/**
 * refer to Main
 */
package LabA;

/**
 * Derived2 class extends from Derived class (which extends Base and implements IType). Note it also
 * has unchanged m1 and m3 methods from Derived
 */
public class Derived2 extends Derived {

    /**
     * Derived2 constructor - prints message when called
     */
    public Derived2() {
        System.out.println("Derived2 Constructor");
    }

    /**
     * m2 method overridden from Derived class (which is implemented in Base class)
     * @param s supplies String to method
     */
    public void m2(String s) {
        System.out.println(s + " from Derived2");
    }

    /**
     * method prints where it is called from
     */
    public void m4() {
        System.out.println("Derived2.m4");
    }

}
