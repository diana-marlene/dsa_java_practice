package org.example.ArraysImpl;

import java.util.Scanner;

public class ArraysDeletion {

    public static void deleteAtThebeginning(int[] arr, int elements){
        for (int i = 0; i < elements; i++){
            arr[i] = arr[i+1];
        }

        System.out.println("Actual array: ");
        for (int i = 0; i < elements-1; i++){
            System.out.print(arr[i]+ "\t");
        }

    }

    public static void deletionAtTheEnd(int[] arr, int elements) {
        arr[elements] = 0;

        System.out.println("Actual array: ");
        for(int i = 0; i < elements-1; i++){
            System.out.print(arr[i]+ "\t");
        }

    }

    public static void deletionAtSpecific(int[] arr, int elements, int index){

        for(int i=0; i < elements; i++){
            if(i >= index-1){
                arr[i] = arr[i+1];
            }
        }

        for(int i=0; i < elements-1; i++){
            System.out.print(arr[i]+ "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Numbers of elements to add: ");
        int elements = sc.nextInt();
        System.out.println("Numbers: ");
        for(int i =0; i<elements; i++){
            arr[i] = sc.nextInt();
        }

        //deleteAtThebeginning(arr,elements);
        //deletionAtTheEnd(arr,elements);
        System.out.println("Position to delete: ");
        int index = sc.nextInt();
        deletionAtSpecific(arr,elements,index);
    }


}
