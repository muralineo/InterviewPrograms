package com.tasks;

import java.util.LinkedList;
import java.util.List;


public class ArrayDifference {

    public static List<String> pairList = new LinkedList<>();

    public static List addPairs(int num1, int num2){

        // This conditions removes the duplicate pairs
        if (!pairList.contains("(" + num1 + "," + num2 + ")")) {

            pairList.add("(" + num1 + "," + num2 + ")");
        }
        return pairList;
    }

    public static List addPairsWithoutSwapping(int num1, int num2) {

        if (!pairList.contains("(" + num1 + "," + num2 + ")") && !pairList.contains("(" + num2 + "," + num1 + ")")) {

            pairList.add("(" + num1 + "," + num2 + ")");
        }
        return pairList;

    }


    public static List pairs (int[] arr, int difference) {
        List<String> result = null;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                // Checks, if the numbers are not same and difference of each number with other numbers
                if ((j != i) && (arr[i]-arr[j] == difference || arr[i]-arr[j] == -difference  )) {
                    //Adding the pairs with given difference into a list
//                  result = addPairs(arr[i], arr[j]);
                    result = addPairsWithoutSwapping(arr[i], arr[j]);

                }
            }
        }

        return result;
    }



    public static void main(String[] args) {

        int[] a = {1,2,2,3,5,4,2,6};
        int[] b = {2,4,-2,-4,3,-3,5,9,15};
        System.out.println(pairs(b, 1));

    }
}
