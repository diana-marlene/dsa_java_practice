package org.example.ArraysImpl;

import java.util.Scanner;
public class ArraySumOfMatricesDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter elements of array B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Resultant matrix is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(C[i][j]);
            }
        }
    }
}
