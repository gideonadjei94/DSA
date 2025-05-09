package Arrays;

import java.util.ArrayList;

// Given an array arr[], the task is to find the top three largest distinct integers present in the array.
//Note: If there are less than three distinct elements in the array, then return the available distinct numbers in descending order.

//Examples :

//Input: arr[] = [10, 4, 3, 50, 23, 90]
//Output: [90, 50, 23]

//Input: arr[] = [10, 9, 9]
//Output: [10, 9]
//There are only two distinct elements


public class LargestThreeElements {

    static ArrayList<Integer> findLargestThree(int[] nums){
        ArrayList<Integer> theLargestThree = new ArrayList<>();
        int fst = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int thd = Integer.MIN_VALUE;

        for(int num : nums){
            if(num > fst){
                thd = sec;
                sec = fst;
                fst = num;
            } else if (num > sec && num != fst) {
                thd = sec;
                sec = num;
            } else if (num > thd && num != sec && num != fst) {
                thd = num;
            }
        }

        if(fst == Integer.MIN_VALUE) return theLargestThree;
        theLargestThree.add(fst);
        if(sec == Integer.MIN_VALUE) return theLargestThree;
        theLargestThree.add(sec);
        if(thd == Integer.MIN_VALUE) return theLargestThree;
        theLargestThree.add(thd);

        return theLargestThree;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 9, 9};
        System.out.println(findLargestThree(numbers));
    }
}
