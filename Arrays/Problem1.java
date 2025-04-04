package Arrays;

//You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive).
//This array represents a permutation of the integers from 1 to n with one element missing.
//Your task is to identify and return the missing element.

//Example:
//Input: arr[] = [1, 2, 3, 5]
//Output: 4
//Explanation: All the numbers from 1 to 5 are present except 4.

public class Problem1 {

    static int findMissingNumber(int[] arr){
        int givenArrayLength = arr.length;

        // Finding Sum of first (n+1) natural numbers using the sum formula (n+1)(n+2)/2
        int totalSum = (givenArrayLength + 1) * (givenArrayLength + 2) / 2;

        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return totalSum - arrSum;

    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(findMissingNumber(arr));
    }

//    static int findMissingNumber(int[] arr){
//        int n = arr.length + 1; // Because one number is missing
//        int xorAll = 0, xorArr = 0;
//
//        // XOR all numbers from 1 to n
//        for (int i = 1; i <= n; i++) {
//            xorAll ^= i;
//        }
//
//        // XOR all elements of the given array
//        for (int num : arr) {
//            xorArr ^= num;
//        }
//
//        // Missing number is the difference
//        return xorAll ^ xorArr;
//
//    }
}
