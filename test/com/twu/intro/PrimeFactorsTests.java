package com.twu.intro;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTests {

    @Test
    public void lowerDivisorShouldBeThePrime() {
        assertEquals(2, new PrimeFactors().lowerDivisor(2));
        assertEquals(3, new PrimeFactors().lowerDivisor(3));
    }

    @Test
    public void lowerDivisorShouldBeTwo() {
        assertEquals(2, new PrimeFactors().lowerDivisor(6));
    }

    @Test
    public void lowerDivisorShouldBeThree() {
        assertEquals(3, new PrimeFactors().lowerDivisor(9));
    }

    @Test
    public void primeFactorsSetShouldBeEmptySet() {
        assertEquals(new HashSet<Integer>(), new PrimeFactors().primeFactorsSet(1));
    }

    @Test
    public void primeFactorsSetShouldHaveTwo() {
        HashSet<Integer> list = new HashSet<Integer>();
        list.add(2);
        assertEquals(list, new PrimeFactors().primeFactorsSet(2));
    }

    @Test
    public void primeFactorsSetShouldHaveTwoThreeFive() {
        HashSet<Integer> list = new HashSet<Integer>();
        list.add(2);
        list.add(3);
        list.add(5);
        assertEquals(list, new PrimeFactors().primeFactorsSet(30));
    }
}
