package org.example.ArraysImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManipulationArray {

    public static long manipulationArray(int n,List<List<Integer>> queries){
        long[] arr = new long[n];
        long max = 0;
        // iterate queries
        for(List<Integer> query: queries){
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);
            //put value inside of array
            for (int i =0; i<n;i++){
                if(i+1>=a && i+1<=b){
                    arr[i]= arr[i]+ k;
                }
                // Max value of array
                max = Math.max(arr[i],max);
            }

        }
        return  max;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,2,100));
        list.add(Arrays.asList(2,5,100));
        list.add(Arrays.asList(3,4,100));

        List<List<Integer>> list2 = new ArrayList<>();
        list2.add(Arrays.asList(1,5,3));
        list2.add(Arrays.asList(4,8,7));
        list2.add(Arrays.asList(6,9,1));
        long result = manipulationArray(n,list2);
        System.out.println(result);
    }
}
