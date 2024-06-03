package BinarySearch;

public class PeakAndTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 2;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int peak = findPeakIndex(arr);
        int firstTry = OderBinarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return OderBinarySearch(arr, target, peak + 1, arr.length - 1);
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

    static int OderBinarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

