package CollectionsRecursion;

import org.junit.Test;

import java.util.*;

/**
    @ author Fei Gu
    @ create 2021-04-13-10.15
    @ grade CS20_EASV_SØNDERBORG
    @ Description
    @ Version
    */
public class CollectionsRecursion {
    public static void main(String[] args) {

        /*
         * Q8
         */
        System.out.println("************* Q8 ***************");

        Customer customer1 = new Customer("Hugo", 95, 55);
        Customer customer2 = new Customer("Svenja", 35, 150);
        Customer customer3 = new Customer("Antonio", 45, 250);
        Customer customer4 = new Customer("Christina-Antoinette", 19, 400);

        List arr = new ArrayList();
        arr.add(customer1);
        arr.add(customer2);
        arr.add(customer3);
        arr.add(customer4);

        for (Object o : arr) {
            System.out.println(o);
        }

        System.out.println("************* Q9 ***************");

        /*
         * Q9
         */

        Collections.sort(arr);
        for (Object o : arr) {
            System.out.println(o);
        }

        System.out.println("************* Q9 ***************");

        /*
         * Q10
         */



    }
}

