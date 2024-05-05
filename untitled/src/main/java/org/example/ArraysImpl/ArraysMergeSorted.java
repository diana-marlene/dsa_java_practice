package org.example.ArraysImpl;

import java.util.Scanner;

public class ArraysMergeSorted {

    public static int[] mergeSorted(int[] arr1, int[] arr2, int element1, int element2){
        int[] mergedArray = new int[element1+element2];
        int index1 = 0;
        int index2 = 0;
        int mergeIndex = 0;

        while (index1 < element1 && index2 < element2) {
            if (arr1[index1] < arr2[index2]) {
                mergedArray[mergeIndex++] = arr1[index1++];
            } else if (arr2[index2] < arr1[index1]) {
                mergedArray[mergeIndex++] = arr2[index2++];
            } else {
                mergedArray[mergeIndex++] = arr1[index1++];
                mergedArray[mergeIndex++] = arr2[index2++];
            }
        }

        while (index1 < element1) {
            mergedArray[mergeIndex++] = arr1[index1++];
        }

        while (index2 < element2) {
            mergedArray[mergeIndex++] = arr2[index2++];
        }
        System.out.println("Merge Sorted array: ");
        for(int i = 0; i< mergedArray.length; i++){
            System.out.print(mergedArray[i]+ "\t");
        }

        return mergedArray;
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
