/**
 * refer to Main
 */
package LabA;

/**
 * Base class
 */
public class Base {

    private static int m1Count = 0;

    /**
     * Base constructor - prints message when called
     */
    public Base(){
        System.out.println("Base constructor.");
    }

    /**
     * method keeps track of universal count of m1 calls from Base objects
     */
    public void m1(){
        m1Count++;
        System.out.println("m1Count: " + m1Count);
    }

    /**
     * method prints given String and says where it's called from
     * @param s supplies String to function
     */
    public void m2(String s){
        System.out.println(s + " from Base.");
    }

}
