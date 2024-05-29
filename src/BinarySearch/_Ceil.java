package BinarySearch;

// The ceil of a target(number) is the least number greater or equal to the target in an array
public class _Ceil {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = FindCeil(arr, target);
        System.out.println(ans);
    }

    private static int FindCeil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }

        // After the loop, start points to the smallest number greater than the target
        // If start is out of bounds, it means target is greater than all elements in the array
        if (start >= arr.length) {
            return -1; // Indicating no ceil found (this can be handled based on requirements)
        }

        return arr[start];
    }
}
