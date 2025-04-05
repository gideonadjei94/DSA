package Arrays;

//You are given an array arr of positive integers. Your task is to find all the leaders in the array.
//An element is considered a leader if it is greater than or equal to all elements to its right.
//The rightmost element is always a leader.

//Examples:

//Input: arr = [16, 17, 4, 3, 5, 2]
//Output: [17, 5, 2]
//Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {

    static ArrayList<Integer> arrayLeaders(int[] arr){
        ArrayList<Integer> leaders = new ArrayList<>();

        int n = arr.length;
        if (n == 0) {
            leaders.add(-1);
            return leaders;
        }

        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        // Reverse the result to maintain original order
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = leaders.size() - 1; i >= 0; i--) {
            result.add(leaders.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(arrayLeaders(arr));
    }
}
