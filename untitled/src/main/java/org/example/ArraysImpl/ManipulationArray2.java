package org.example.ArraysImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManipulationArray2 {
    public static long manipulationArray(int n,List<List<Integer>> queries){
        long[] arr = new long[n + 1]; // +1 for prefix sum
        System.out.println(arr.length);
        long max = Long.MIN_VALUE;

        for (List<Integer> query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);
            arr[a - 1] += k;
            if (b < n) {
                arr[b] -= k;
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
        }

        return max;

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
        long result = manipulationArray(n,list);
        System.out.println(result);
    }
}