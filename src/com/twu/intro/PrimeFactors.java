package com.twu.intro;

import java.util.HashSet;

public class PrimeFactors {

    private int FIRST_IMPORTANT_PRIME = 2;

    public HashSet<Integer> primeFactorsSet(int n){
        HashSet<Integer> result = new HashSet<Integer>();
        return result;
    }

    public int lowerDivisor(int n){
        int i;
        for (i = FIRST_IMPORTANT_PRIME; i < n; i++){
            if(n % i == 0){
                return i;
            }
        }
        return 0;
    }
}
