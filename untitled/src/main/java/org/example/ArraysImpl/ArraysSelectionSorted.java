package org.example.ArraysImpl;

public class ArraysSelectionSorted {
    public static void main(String[] args) {
        int[] arr = {22,12,8,7,45,9};
        int min = 0;
        int pos = 0;
        int temp = 0;

        for(int i = 1; i < arr.length; i++){  //iterate all values in array
            min = arr[i-1];  // the element to check between others
            pos = i-1;      // the position to check between others
            for(int j = i; j < arr.length; j++){ //iterate values to find smallest value
                if(arr[j] < min){
                    min = arr[j];  // smallest value
                    pos = j;
                }
            }

            // Interchange
            if(pos != i-1){  // position is equal to lastest min?
                temp = arr[pos];
                arr[pos] = arr[i-1];
                arr[i-1] = temp;
            }
        }

        System.out.println("Sorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
