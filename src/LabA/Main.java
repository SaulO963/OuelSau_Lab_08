/**
 * Name: Saul Ouellet
 * Date: Mar 21st 2022
 * Description: Program tests inheritance/derivation - implements classes that will extend and implement
 * one-another to see how their method calls will work. The methods are called from an ArrayList which
 * holds objects that all inherit from a Base class. Note that m2 call for Base and Derived are the same
 * since Derived extends Base and doesn't override a new m2 method.
 */
package LabA;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Main class
 */
public class Main {

    /**
     * main showcases which constructors are called when creating the objects, then shows
     * which methods are used when they are called from an ArrayList of Base objects
     * @param args supplies args to main
     */
    public static void main(String[] args){

        System.out.println("CREATING Base FROM MAIN");
        Base b = new Base();
        System.out.println("");

        System.out.println("CREATING Derived FROM MAIN");
        Derived d = new Derived();
        System.out.println("");

        System.out.println("CREATING Derived2 FROM MAIN");
        Derived2 dTwo = new Derived2();
        System.out.println("");

        System.out.println("CREATING Separate FROM MAIN");
        Separate s = new Separate();
        System.out.println("");

        System.out.println("TESTING Base METHODS");
        b.m1();
        b.m1();
        b.m2("Howdy");
        System.out.println("");

        System.out.println("TESTING Derived METHODS");
        d.m1();
        d.m2("Hi");
        d.m3();
        System.out.println("");

        System.out.println("TESTING Derived2 METHODS");
        dTwo.m1();
        dTwo.m2("Hello");
        dTwo.m3();
        dTwo.m4();
        System.out.println("");

        System.out.println("TESTING Separate METHODS");
        s.m1();
        s.m1();
        s.m2("Hola");
        s.m3();
        System.out.println("");

        System.out.println("CREATING 10 Base OBJECTS");
        Base b1 = new Base();
        Base b2 = new Base();
        Base b3 = new Base();
        Base b4 = new Base();
        Base b5 = new Base();
        Base b6 = new Base();
        Base b7 = new Base();
        Base b8 = new Base();
        Base b9 = new Base();
        Base b10 = new Base();
        System.out.println("");


        System.out.println("CREATING 10 Derived OBJECTS");
        Derived d1 = new Derived();
        Derived d2 = new Derived();
        Derived d3 = new Derived();
        Derived d4 = new Derived();
        Derived d5 = new Derived();
        Derived d6 = new Derived();
        Derived d7 = new Derived();
        Derived d8 = new Derived();
        Derived d9 = new Derived();
        Derived d10 = new Derived();
        System.out.println("");


        System.out.println("CREATING 10 Derived2 OBJECTS");
        Derived2 dTwo1 = new Derived2();
        Derived2 dTwo2 = new Derived2();
        Derived2 dTwo3 = new Derived2();
        Derived2 dTwo4 = new Derived2();
        Derived2 dTwo5 = new Derived2();
        Derived2 dTwo6 = new Derived2();
        Derived2 dTwo7 = new Derived2();
        Derived2 dTwo8 = new Derived2();
        Derived2 dTwo9 = new Derived2();
        Derived2 dTwo10 = new Derived2();
        System.out.println("");

        ArrayList<Base> baseList = new ArrayList<Base>();

        baseList.add(b1);
        baseList.add(b2);
        baseList.add(b3);
        baseList.add(b4);
        baseList.add(b5);
        baseList.add(b6);
        baseList.add(b7);
        baseList.add(b8);
        baseList.add(b9);
        baseList.add(b10);

        baseList.add(d1);
        baseList.add(d2);
        baseList.add(d3);
        baseList.add(d4);
        baseList.add(d5);
        baseList.add(d6);
        baseList.add(d7);
        baseList.add(d8);
        baseList.add(d9);
        baseList.add(d10);

        baseList.add(dTwo1);
        baseList.add(dTwo2);
        baseList.add(dTwo3);
        baseList.add(dTwo4);
        baseList.add(dTwo5);
        baseList.add(dTwo6);
        baseList.add(dTwo7);
        baseList.add(dTwo8);
        baseList.add(dTwo9);
        baseList.add(dTwo10);

        Iterator<Base> iter = baseList.iterator();
        int count = 1;

        while(iter.hasNext()){
            System.out.println("Object #" + count + ":");
            iter.next().m2("Bonjour");
            System.out.println("");
            count++;
        }






    }

}
