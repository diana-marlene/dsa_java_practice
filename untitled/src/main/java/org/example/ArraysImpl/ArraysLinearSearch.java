package org.example.ArraysImpl;

import java.util.Scanner;

public class ArraysLinearSearch {

    public static int linearSearch(int[] arr,int elements,int searchElement){

        for(int i = 0; i < elements; i++){
            if(arr[i] == searchElement){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Number of elements: ");
        int elements = sc.nextInt();

        System.out.println("Values:");
        for(int i = 0; i < elements; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Actual array: ");
        for(int i = 0; i < elements; i++){
            System.out.println(arr[i]+"\t");
        }

        System.out.println("Value of element to search: ");
        int searchElement = sc.nextInt();

        int res = linearSearch(arr,elements,searchElement);

        System.out.println("Value found at position: " +res);

    }
}
