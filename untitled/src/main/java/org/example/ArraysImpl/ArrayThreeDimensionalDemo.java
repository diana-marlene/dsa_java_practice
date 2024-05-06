package org.example.ArraysImpl;

import java.util.Scanner;

public class ArrayThreeDimensionalDemo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][][] array = new int[2][2][2];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    array[i][j][k] = scn.nextInt();
                }
            }
        }
        System.out.println("The array is:");
        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                System.out.println();
                for (int k = 0; k < 2; k++) {
                    System.out.println("array[" + i + "]" +
                            "[" + j + "]" + "[" + k + "]" +
                            " = " + array[i][j][k]);
                }
            }
        }
    }
}

