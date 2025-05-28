package TwoPointer.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumPairsWithZeroSum {

    static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);

                // Skip duplicates for left
                int leftVal = arr[left];
                while (left < right && arr[left] == leftVal) left++;

                // Skip duplicates for right
                int rightVal = arr[right];
                while (left < right && arr[right] == rightVal) right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        ArrayList<ArrayList<Integer>> pairs = getPairs(arr);

        System.out.println(pairs);
    }
}
