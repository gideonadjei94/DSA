package BinarySearch;
import java.util.Arrays;

//This code finds the position of the first and last occurrence of a target(number) in a sorted array
public class Positions {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(searchPositions(nums, target)));
    }

    //Searches for the position of the first and last occurrence
    //Function return [-1, -1] if no occurrence is found
    public static int[] searchPositions(int[] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = Search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = Search(nums, target, false);
        }
        return ans;
    }
        // Search for first various positions of occurrence
     static int Search(int[] nums, int target, boolean findFirstOccur){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(findFirstOccur){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
