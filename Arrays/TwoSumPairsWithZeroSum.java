package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSumPairsWithZeroSum {

    static ArrayList<ArrayList<Integer>> getPairsWithZeroSum(int[] arr){
            Arrays.sort(arr);
            int left = 0;
            int right = arr.length - 1;
            Set<String> seenPairs = new HashSet<>();
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == 0) {
                    String key = arr[left] + "," + arr[right];
                    if (!seenPairs.contains(key)) {
                        seenPairs.add(key);
                        result.add(new ArrayList<>(Arrays.asList(arr[left], arr[right])));
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

            return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(getPairsWithZeroSum(nums));
    }
}
