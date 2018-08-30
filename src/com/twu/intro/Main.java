package com.twu.intro;

public class Main {

    public static void main (String[] args){

        TriangleExercises triangleExercises = new TriangleExercises();

        System.out.println("Easiest exercise ever\n");
        triangleExercises.horizontalLineOfAsteriskGivenN(1);

        System.out.println("\nDraw a horizontal line\n");
        triangleExercises.horizontalLineOfAsteriskGivenN(8);

        System.out.println("\nDraw a vertical line\n");
        triangleExercises.verticalLineOfAsteriskGivenN(3);

        System.out.println("\nDraw a right triangle\n");
        triangleExercises.triangleGivenN(3);

    }


}
