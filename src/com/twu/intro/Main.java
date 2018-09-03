package com.twu.intro;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter n: ");
        int n = sc.nextInt();

        TriangleAndDiamondExercises triangleAndDiamondExercises = new TriangleAndDiamondExercises();

        System.out.println("\nEasiest exercise ever\n");
        triangleAndDiamondExercises.horizontalLineOfAsteriskGivenN(1);

        System.out.println("\nDraw a horizontal line\n");
        triangleAndDiamondExercises.horizontalLineOfAsteriskGivenN(n);

        System.out.println("\nDraw a vertical line\n");
        triangleAndDiamondExercises.verticalLineOfAsteriskGivenN(n);

        System.out.println("\nDraw a right triangle\n");
        triangleAndDiamondExercises.triangleGivenN(n);

        System.out.println("\nIsosceles Triangle\n");
        triangleAndDiamondExercises.isoscelesAsteriskTriangleGivenN(n);

        System.out.println("\nDiamond\n");
        triangleAndDiamondExercises.diamondAsteriskGivenN(n);

        System.out.println("\nDiamond with Name\n");
        triangleAndDiamondExercises.diamondAsteriskGivenNPlusName(n);

        System.out.println("\nFizzBuzz Exercise\n");
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzzNumbers(100);

        System.out.println("\nPrime Factors Exercise\n");
        PrimeFactors primeFactors = new PrimeFactors();
        System.out.println(primeFactors.primeFactorsSet(n));

    }


}
