package Arrays;

//Given an array of positive integers arr[], return the second largest element from the array.
//If the second-largest element doesn't exist then return -1.
//
//Note: The second largest element should not be equal to the largest element.
//
//Examples:
//
//Input: arr[] = [12, 35, 1, 10, 34, 1]
//Output: 34
//Explanation: The largest element of the array is 35 and the second-largest element is 34.

//Constraints:
//        2 ≤ arr.size() ≤ 105
//        1 ≤ arr[i] ≤ 105

import java.util.Arrays;

public class SecondLargestElement {

    static int GetSecondLargest(int[] arr){
        if (arr.length < 2) return -1; // Not enough elements

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                // Shift largest to secondLargest before updating
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = {10, 10, 10};
        System.out.println(GetSecondLargest(nums));
    }

}
