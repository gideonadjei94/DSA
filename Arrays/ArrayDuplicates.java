package Arrays;

//Given an array arr of integers, find all the elements that occur more than once in the array.
//If no element repeats, return an empty array.

//Examples:
//
//Input: arr[] = [2, 3, 1, 2, 3]
//Output: [2, 3]
//Explanation: 2 and 3 occur more than once in the given array.

import java.util.*;

public class ArrayDuplicates {

    static List<Integer> arrayDuplicates(int[] arr){
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr= {0, 3, 1, 2};
        System.out.println(arrayDuplicates(arr));
    }

}
