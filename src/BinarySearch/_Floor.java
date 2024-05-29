package BinarySearch;

public class _Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 10;
        int ans = FindFloor(arr, target);
        System.out.println(ans);
    }

    private static int FindFloor(int[] arr, int target) {
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
        if (end >= arr.length) {
            return -1; // Indicating no ceil found (this can be handled based on requirements)
        }

        return arr[end];
    }
}
