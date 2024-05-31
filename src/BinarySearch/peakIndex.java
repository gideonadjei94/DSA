package BinarySearch;

public class peakIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 9, 12, 11, 5, 0};
        System.out.println(findPeakIndex(arr));
    }
    static  int findPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1] ){
                //you are in the descending part of the array
                end = mid;
            }else {
                // You are in the ascending part of the array
                start = mid + 1;
            }
        }
        return start;
    }
}
