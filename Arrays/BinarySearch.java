package Arrays;

public class BinarySearch {

    static int binarySearch(int[] arr, int k){
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (k < arr[mid]) {
                end = mid - 1;
            } else if (k > arr[mid]) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {11, 22, 33, 44, 55};
        System.out.println(binarySearch(nums, 57));
    }
}
