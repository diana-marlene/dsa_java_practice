package org.example.ArraysImpl;

import java.util.Scanner;

public class ArraysMergeSorted {

    public static void mergeSorted(int[] arr1, int[] arr2, int element1, int element2){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        System.out.println("Array 1: ");
        System.out.println("Number of elements: ");
        int elements1 = sc.nextInt();

        System.out.println("Add values: ");
        for(int i = 0; i < elements1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Actual array: ");

        for(int i = 0; i < elements1; i++){
            System.out.println(arr1[i]+ "\t");
        }
        System.out.println("Array 2: ");
        System.out.println("Number of elements: ");
        int elements2 = sc.nextInt();

        System.out.println("Add values: ");
        for(int i = 0; i < elements2; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("Actual array: ");

        for(int i = 0; i < elements2; i++){
            System.out.println(arr2[i]+ "\t");
        }

        mergeSorted(arr1,arr2,elements1,elements2);


    }
}
