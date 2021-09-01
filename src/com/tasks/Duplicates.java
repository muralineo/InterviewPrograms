package com.tasks;

import java.util.*;

public class Duplicates {

    public static void countDuplicates(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        for (int number : numbers) {
            if (set.contains(number)) {
                duplicateSet.add(number);
            } else {
                set.add(number);
            }
        }

        System.out.println("The total number of duplicates: " + duplicateSet.size());
    }


    public static void duplicateOccurrence(int[] arr) {

        HashMap<Integer, Integer> map =new HashMap<>();

        for (int number : arr) {
            if (map.containsKey(number)) {
                Integer value = map.get(number);
                map.put(number, value+1);
            } else {
                map.put(number, 1);
            }

        }
        System.out.println("The duplicates and number of highest occurrence to lowest occurrence ");
        System.out.println(sortByValue(map));

    }


    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list = new LinkedList<>(hm.entrySet());

        // Sort the list
        list.sort(Map.Entry.comparingByValue());

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> sortedDuplicate = new LinkedHashMap<>();

        for (int i = list.size() - 1; i >=0 ; i--) {
            if (list.get(i).getValue() != 1) {
                sortedDuplicate.put(list.get(i).getKey(), list.get(i).getValue());
            }

        }
        return sortedDuplicate;
    }


    public static void main(String[] args) {

        int[] a ={100,20,30,30,30,40,20,50,50,60,90,80,90,100,100};

        countDuplicates(a);
        duplicateOccurrence(a);

    }
}
