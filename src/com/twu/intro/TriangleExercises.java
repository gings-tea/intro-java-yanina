package com.twu.intro;

public class TriangleExercises {

    public void horizontalLineOfAsteriskGivenN(int n){
        int i;
        for(i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void verticalLineOfAsteriskGivenN(int n){
        int i;
        for(i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    public void triangleGivenN(int n){
        int i;
        for(i = 1; i <= n; i++){
            horizontalLineOfAsteriskGivenN(i);
        }
    }
}
