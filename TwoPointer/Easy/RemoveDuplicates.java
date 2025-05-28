package TwoPointer.Easy;

import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] arr){
        int n = arr.length;
        int idx = 1;

        for (int i = 1; i < n; i++){
            if(arr[i] != arr[i - 1]){
                idx++;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] arr= {1, 2, 4};
        System.out.println(removeDuplicates(arr));
    }
}
