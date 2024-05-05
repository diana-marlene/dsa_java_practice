package org.example.ArraysImpl;

import java.util.Scanner;

public class ArraysInsertion {

    public static void insertionAtTheBeginning(int[] arr, int n, int value){
        System.out.println("\n Insertion at the beginning");
        //Insertion at the beginning
        if(n == arr.length){
            System.out.println("Error overflow");
        }else{

            // move elments to i+1

            for(int i = n-1; i >=0; i--){
                arr[i+1] = arr[i];
            }
            arr[0] = value;

            for(int i =0; i<=n; i++){
                System.out.print(arr[i] + "\t");
            }

        }
    }
    public static void insertionAtTheEnd(int[] arr , int n, int value){

        arr[n] = value;
        for(int i = 0; i<=n; i++){
            System.out.print(arr[i] + "\t");
        }

    }
    public static void insertionAtSpecificPosition(int[] arr, int n, int value){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position");
        int pos = sc.nextInt();
        for (int i = n - 1; i >= pos - 1; i--) {
            arr[i + 1] = arr[i];
        }

        arr[pos - 1] = value;
        System.out.println("After insertion array is");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10]; // Declaring int array
        int [] arr1 = {20,30,40,50,60,70}; // Declaring int array at compile time

        System.out.println("Number of elements to add: ");
        int n = sc.nextInt(); // elements that put in array
        System.out.println("Elements: ");
        //inserting elements
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); // Initialization at run time
        }
        System.out.println("Printing...");
        //print elements
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n New element: ");
        int newElement = sc.nextInt();

        insertionAtSpecificPosition(arr,n,newElement);


    }

}

