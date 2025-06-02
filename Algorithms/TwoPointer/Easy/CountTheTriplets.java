package Algorithms.TwoPointer.Easy;

// Given an array arr, count the number of distinct triplets (a, b, c) such that:

//a + b = c

//Each triplet is counted only once, regardless of the order of a and b.

//Even if the same number appears multiple times in the array, a valid triplet should be counted only once per unique combination.

//Examples:

//Input: arr[] = [1, 5, 3, 2]
//Output: 2
//Explanation: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
//Input: arr[] = [2, 3, 4]
//Output: 0
//Explanation: No such triplet exits

import java.util.Arrays;
public class CountTheTriplets {

    static int numberOfTriplets(int[] arr){
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);

        // Fix the third element (arr[i]) and find two elements before it
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == arr[i]) {
                    count++;
                    left++;
                    right--;
                } else if (sum < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }



    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};
        System.out.println(numberOfTriplets(arr));
    }
}
