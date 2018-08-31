package com.twu.intro;

public class FizzBuzz {

    private int FIRST_FIZZ_BUZZ_NUMBER = 1;

    public void printFizzBuzzNumbers(int n){
        int i;
        for (i = FIRST_FIZZ_BUZZ_NUMBER; i <= n; i++){
            if(isDivisibleByThreeOrFive(i)){
                printFizz(i);
                printBuzz(i);
            }
            else {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private void printBuzz(int n) {
        if (isDivisibleByFive(n)){
            System.out.print("Buzz");
        }
    }

    private void printFizz(int n){
        if (isDivisibleByThree(n)){
            System.out.print("Fizz");
        }
    }


    private boolean isDivisibleByThree(int n){
        return (n % 3) == 0;
    }

    private boolean isDivisibleByFive(int n){
        return (n % 5) == 0;
    }

    private boolean isDivisibleByThreeOrFive(int n){
        return isDivisibleByThree(n) || isDivisibleByFive(n);
    }
}
