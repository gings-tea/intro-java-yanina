package com.twu.intro;

public class TriangleAndDiamondExercises {

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

    public void isoscelesAsteriskTriangleGivenN(int n){
        normalIsoscelesAsteriskTriangleGivenN(n);
        horizontalLineOfAsteriskGivenN(2*n-1);
    }

    public void diamondAsteriskGivenN(int n ){
        isoscelesAsteriskTriangleGivenN(n);
        invertedIsoscelesAsteriskTriangleGivenN(n);
    }

    public void diamondAsteriskGivenNPlusName(int n ){
        normalIsoscelesAsteriskTriangleGivenN(n);
        System.out.println("YANINA");
        invertedIsoscelesAsteriskTriangleGivenN(n);
    }

    private void invertedIsoscelesAsteriskTriangleGivenN(int n){
        int i;
        for (i=n-1; i>0;i--){
            triangleLine(n,i);
        }
    }

    private void normalIsoscelesAsteriskTriangleGivenN(int n){
        int i;
        for (i=1; i<n; i++){
            triangleLine(n,i);
        }
    }

    private void triangleLine(int n, int nAsterisk){
        printSpaces(n-nAsterisk);
        horizontalLineOfAsteriskGivenN(2*nAsterisk-1);

    }

    private void printSpaces(int n){
        int i;
        for(i=0; i < n; i++){
            System.out.print(" ");
        }
    }
}
