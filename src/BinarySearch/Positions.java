package BinarySearch;
import java.util.Arrays;

public class Positions {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,8,10};
        int target = 8;
        int[] PositionArr = new int[2];
            for(int j = 0 , k = arr.length -1 ; j < arr.length; j++, k--){
                if(arr[j] == target){
                    PositionArr[0] = j;
                    break;
                }
                if(arr[k] == target){
                    PositionArr[1] = k;
                    break;
                }
            }

        System.out.println(Arrays.toString(PositionArr));
    }
}
