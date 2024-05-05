package org.example.ArraysImpl;

import java.util.Scanner;
public class ArrayMergeSortedDemo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr1, arr2, arr3;
        int i = 0, j = 0, k = 0;
        System.out.println("Enter number of elements in array 1:");
        int m1 = scn.nextInt();
        arr1 = new int[m1];
        System.out.println("Enter elements of array 1:");
        for (int s = 0; s < m1; s++) {
            arr1[s] = scn.nextInt();
        }

        System.out.println("Enter number of elements in array 2:");
        int m2 = scn.nextInt();
        arr2 = new int[m2];
        System.out.println("Enter elements of array 2:");
        for (int s = 0; s < m2; s++) {
            arr2[s] = scn.nextInt();
        }

        arr3 = new int[m1 + m2];
        while (i < m1 && j < m2) {

            System.out.println("En el while");
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                System.out.println("if 1: "+arr3[k]);
                System.out.println("j "+j +" k "+k);

                k++;
                i++;
            } else if (arr2[j] < arr1[i]) {
                arr3[k] = arr2[j];
                System.out.println("if 2: "+arr3[k]);
                System.out.println("i "+i +" k "+k);
                j++;
                k++;

            } else {
                arr3[k] = arr1[i];
                System.out.println("if s: "+arr3[k]);
                System.out.println("i "+i +" k "+k+" j "+j);
                k++;
                i++;
                arr3[k] = arr2[j];
                k++;
                j++;
            }

        } // End of while loop
        while (i < m1) {
            arr3[k] = arr1[i];
            k++;
            i++;
        }
        while (j < m2) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }
        System.out.println("After merging new array is:");
        for (int s = 0; s < (m1 + m2); s++) {
            System.out.print(arr3[s] + " ");
        }
    }
}