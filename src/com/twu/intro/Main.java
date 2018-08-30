package com.twu.intro;

public class Main {

    public static void main (String[] args){

        int n = 5;

        TriangleAndDiamondExercises triangleAndDiamondExercises = new TriangleAndDiamondExercises();

        System.out.println("Easiest exercise ever\n");
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
