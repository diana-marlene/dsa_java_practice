package org.example.ArraysImpl;
import java.util.*;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        // Write your code here
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i < arr.size()- 2;i++){
            for (int j=0; j < arr.get(i).size()- 2;j++){
                int sum = arr.get(i).get(j) + arr.get(i).get(j+1)+ arr.get(i).get(j+2)
                        + arr.get(i+1).get(j+1)
                        + arr.get(i+2).get(j)+ arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                maxSum = Math.max(maxSum, sum);


            }
        }
        return maxSum;

    }

}

public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        // Fill list 2D
        for (int i = 0; i < 6; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                innerList.add(1); // or any other default value
            }
            arr.add(innerList);
        }

        int result = Result.hourglassSum(arr);
        System.out.println(arr);
        System.out.println(result);

    }
}