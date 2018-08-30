package com.twu.intro;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
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

    }


}
