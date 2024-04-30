package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dynamic2Arrays {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries){
        List<List<Integer>> temp = new ArrayList<>();
        List<Integer> sol = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            temp.add(new ArrayList<>());
        }
        System.out.println("Temp to string "+temp.toString());
        int lastAnswer = 0;

        for(List<Integer> query: queries){
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            System.out.println("type, x, y : "+type +" "+ x +" "+ y);

            int idx = (x ^ lastAnswer) % n;
            System.out.println("idx : "+idx);
            if(type == 1){
                System.out.println("type 1");
                temp.get(idx).add(y);
                System.out.println("temp(idx) "+ temp.get(idx));
            }
            else if(type == 2){
                System.out.println("type 2");
                lastAnswer = temp.get(idx).get( y % temp.get(idx).size() );
                System.out.println("lastAnswer "+lastAnswer);
                sol.add(lastAnswer);
            }

        }

        return sol;
    }


    public static void main(String[] args) {
        int n =2;
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1, 0, 5)));
        arr.add(new ArrayList<>(Arrays.asList(1, 1, 7)));
        arr.add(new ArrayList<>(Arrays.asList(1, 0, 3)));
        arr.add(new ArrayList<>(Arrays.asList(2, 1, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 1, 1)));

        List<Integer> result = dynamicArray(n,arr);
        System.out.println(result);

    }
}