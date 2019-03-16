package primeFactors;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static primeFactors.PrimeFactors.generate;

public class PrimeFactorsTest {
    private List<Integer> list(int ... ints) {
        List<Integer> list =  new ArrayList<Integer>();
        for(int i: ints){
            list.add(i);
        }
        return list;
    }

    @Test
    public void testOne(){
        assertEquals(list(), generate(1));
    }

    @Test
    public void testTwo(){
        assertEquals(list(2), generate(2));
    }

    @Test
    public void testThree(){
        assertEquals(list(3),generate(3));
    }

    @Test
    public void testFour(){
        assertEquals(list(2,2), generate(4));
    }

    @Test
    public void testSix(){
        assertEquals(list(2,3), generate(6));
    }

    @Test
    public void testEight(){
        assertEquals(list(2,2,2),generate(8));
    }

    @Test
    public void testNine(){
        assertEquals(list(3,3), generate(9));
    }
}