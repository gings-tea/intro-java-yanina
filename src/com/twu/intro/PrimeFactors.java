package com.twu.intro;

import java.util.HashSet;

public class PrimeFactors {

    private int FIRST_IMPORTANT_PRIME = 2;

    public HashSet<Integer> primeFactorsSet(int n){
        HashSet<Integer> result = new HashSet<>();
        while(n > 1){
            int lowerDivisor = lowerDivisor(n);
            addLowerNotZeroDivisor(lowerDivisor, result);
            n = n/lowerDivisor;
        }

        return result;
    }

    private void addLowerNotZeroDivisor(int lowerDivisor, HashSet<Integer> result) {
        if(lowerDivisor > 0 ) {
            result.add(lowerDivisor);
        }
    }

    public int lowerDivisor(int n){
        int i;
        for (i = FIRST_IMPORTANT_PRIME; i <= n; i++){
            if(n % i == 0){
                return i;
            }
        }
        return 0;
    }
}
