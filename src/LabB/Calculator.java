/**
 * Name: Saul Ouellet
 * Date: Mar 21st 2022
 * Description: Program tests strategy patterns - implements a common interface OpClass that describes
 * a method op (operator) which is inherited by 3 classes: Square, Cube, and SquareRoot. Each class
 * implements their obvious method. Calculator (our main) implements a method apply to apply a specific
 * OpClass operation onto an ArrayList of Number type objects.
 */
package LabB;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Calculator class - acts as main, implements apply function
 */
public class Calculator{

    /**
     * main fills an ArrayList with doubles, tests each OpClass
     * @param args supplies args to main
     */
    public static void main(String[] args){

        /*
        Square s = new Square();
        Cube c = new Cube();
        SquareRoot sr = new SquareRoot();

        System.out.println(s.getClass());
        System.out.println(c.getClass());
        System.out.println(sr.getClass());

        System.out.println(s.op(5.0).getClass());
        System.out.println(c.op(5.0).getClass());
        System.out.println(sr.op(5.0).getClass());

        System.out.println(s.op(5.0));
        System.out.println(c.op(5.0));
        System.out.println(sr.op(5.0));
        */

        ArrayList<Number> start = new ArrayList<Number>();
        start.add(1.0);
        start.add(2.0);
        start.add(3.0);
        start.add(4.0);
        start.add(5.0);
        start.add(6.0);
        start.add(7.0);
        start.add(8.0);
        start.add(9.0);
        start.add(10.0);
        start.add(11.1);
        start.add(22.2);
        start.add(33.3);
        start.add(44.4);
        start.add(55.5);

        Square s = new Square();
        Cube c = new Cube();
        SquareRoot sr = new SquareRoot();

        ArrayList<Number> end = apply(start,s);

        Iterator<Number> iter = end.iterator();

        System.out.println("Testing Square: List 1 -> List 2");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        ArrayList<Number> end2 = apply(end,c);

        Iterator<Number> iter2 = end2.iterator();

        System.out.println("\nTesting Cube: List 2 -> List 3");
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }

        ArrayList<Number> end3 = apply(end2,sr);

        Iterator<Number> iter3 = end3.iterator();

        System.out.println("\nTesting SquareRoot: List 3 -> List 4");
        while(iter3.hasNext()){
            System.out.println(iter3.next());
        }


    }

    /**
     * method applies given class method that inherits OpClass to a given ArrayList of Number objects
     * @param nums supplies ArrayList of Numbers to function
     * @param X supplies OpClass to function
     * @return returns newly modified ArrayList
     */
    public static ArrayList<Number> apply(ArrayList<Number> nums, OpClass X){

        ArrayList<Number> newNums = new ArrayList<Number>();

        Iterator<Number> iter = nums.iterator();

        while(iter.hasNext()){
            Number a = iter.next();
            newNums.add((Number)X.op(a));
        }

        return newNums;
    }

}
