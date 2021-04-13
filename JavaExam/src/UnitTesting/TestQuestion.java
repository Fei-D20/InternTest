package UnitTesting;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @ author Fei Gu
 * @ create 2021-04-13-10.55
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */
public class TestQuestion {
    @Test
    public void test(){
        int actual= smallest(2, 3, 4);
        int expected = 2;
        assertEquals(expected,actual);
        System.out.println("actual: " + actual + " expected: " + expected );
    }

    @Test
    public void test2(){
        int actual= smallest(1, -3,0);
        int expected = -3;
        assertEquals(expected,actual);
        System.out.println("actual: " + actual + " expected: " + expected );

    }


    public static int smallest(int a, int b, int c){
        if(a < b){
            if(a < c){
                return a;
            }
        }else {
            if(b < c){
                return b;
            }
        }
        return c;
    }
}
