package org.example.ArraysImpl;

import java.util.Scanner;
public class ArraySelectionSortedDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr;
        int min = 0;
        int pos = 0;
        int temp = 0;
        System.out.println("Enter number of elements in array:");
        int n = scn.nextInt();
        arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("***Selection Sort***");
        for (int i = 1; i < n; i++) {
            min = arr[i - 1];
            pos = i - 1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            if (pos != i - 1) {
                temp = arr[pos];
                arr[pos] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        System.out.println("After sorting new array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
