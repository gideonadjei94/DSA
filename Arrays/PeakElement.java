package Arrays;

public class PeakElement {

    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean leftSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightSmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            if (leftSmaller && rightSmaller) {
                return mid;
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static boolean isValidPeak(int[] arr, int index) {
        int n = arr.length;
        int left = index == 0 ? Integer.MIN_VALUE : arr[index - 1];
        int right = index == n - 1 ? Integer.MIN_VALUE : arr[index + 1];
        return arr[index] > left && arr[index] > right;
    }


        public static void main (String[] args){
            int[] nums = {1, 2, 4, 5, 7, 8, 3};

            int peakIndex = findPeak(nums);
            boolean result = isValidPeak(nums, peakIndex);

            System.out.println(findPeak(nums));
        }
    }

