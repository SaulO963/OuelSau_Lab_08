/**
 * refer to Main
 */
package LabA;

/**
 * Derived class extends Base class and inherits from IType. Note it also has unchanged
 * m2 method from Base
 */
public class Derived extends Base implements IType{

    /**
     * Derived constructor - prints message when called
     */
    public Derived(){
        System.out.println("Derived Constructor");
    }

    /**
     * m1 method overridden from Base class, prints where it is called from
     */
    @Override
    public void m1(){
        System.out.println("Derived.m1");
    }

    /**
     * m3 method overridden from IType interface, prints where it is called from
     */
    @Override
    public void m3() {
        System.out.println("Derived.m3");
    }

}
