package Arrays;

//Given an array of integers arr[], the task is to find the first equilibrium point in the array.
//The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it.
//Return -1 if no such point exists.

//Examples:

//Input: arr[] = [1, 2, 0, 3]
//Output: 2
//Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.

public class EquilibriumPoint {

        static int findEquillibrium(int[] arr){
            int totalSum = 0;
            int leftSum = 0;

            for (int num : arr) {
                totalSum += num;
            }

            for (int i = 0; i < arr.length; i++) {
                totalSum -= arr[i];

                if (leftSum == totalSum) {
                    return i;
                }

                leftSum += arr[i];
            }

            return -1;
        }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        System.out.println(findEquillibrium(nums));
    }

}
