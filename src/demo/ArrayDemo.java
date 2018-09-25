package demo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // Arrays are datastructures where every element must
        // be the same type
        int[] intArr = new int[3];
        int[] intArr2 = {1, 2, 3};
        int intArr3[];
        int []intArr4;

        //2D Arrays
        int[][] twoDArr = {{1}, {2, 3}, {4, 5, 6}};
        int twoDarr2[][] = new int[3][4];
        int []intArr7[];

        //iterate through an array
        for (int i=0; i < intArr2.length; i++) {
            System.out.print(intArr2[i]);
        }

        for (int i =0; i < twoDArr.length; i++) {
            for (int j=0; j < twoDArr[i].length; j++) {
                System.out.print(twoDArr[i][j]);
            }
        }

        //for (;;) { }

        int[] messyArray = {234, 5346, 3, 64};
        Arrays.sort(messyArray);
        System.out.println(Arrays.toString(messyArray));

        varArgDemo("m", 1, 2, 5, 35, 346, 345, 4634);
    }

    //Varargs are variable inputs that are converted into
    // an array. To use, add elipsis before the variable name
    // Varags must be the last or only parameter
    public static void varArgDemo(String m, int... myArgs) {
        for (int i : myArgs) {
            System.out.print(i);
        }
    }
}