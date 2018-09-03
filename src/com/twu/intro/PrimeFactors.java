package com.twu.intro;

import java.util.Set;

public class PrimeFactors {

    private int FIRST_IMPORTANT_PRIME = 2;



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
