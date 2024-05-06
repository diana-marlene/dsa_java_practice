package org.example.ArraysImpl;

import java.util.Scanner;

/***
 *
 * The elements of matrix are:
 *
 * 2 3 4
 * 5 6 7
 * 8 9 10
 * Elements of transposed matrix are:
 *
 * 2 5 8
 * 3 6 9
 * 4 7 10
 */



public class ArrayTransposeDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[][] transpose = new int[3][3];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println("The elements of matrix are:");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");

            }
        }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    transpose[i][j] = matrix[j][i];
                }
            }
            System.out.println("\nElements of transposed matrix are:");
            for (int i = 0; i < 3; i++) {
                System.out.println();
                for (int j = 0; j < 3; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
            }
        }
    }
