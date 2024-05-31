package BinarySearch;

//Finding the position of an element in an infinite array means
//the length of the array is not known therefore you cannot use the (arr.length) method
public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 8, 9, 11, 15, 17, 18, 22, 44};
        int target = 2;
        System.out.println(findElement(arr, target));
    }
    static int findElement(int[] arr, int target){
        int start = 0;
        int end = 1;
        //Checking if target is in current size of array
        //If target is greater, increases the size of the search array
        while(target > arr[end]){
            end++;
        }
        return BinarySearch(arr, target, start, end);
    }
     static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
