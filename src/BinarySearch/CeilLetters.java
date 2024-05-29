package BinarySearch;

//This Code finds the next letter greater than the targeted letter in an array
public class CeilLetters {
    public static void main(String[] args) {
        char[] arr = {'c', 'e', 'f', 'g', 'i'};
        char target = 'h';
        char ans = FindCeil(arr, target);
        System.out.println(ans);
    }

    //Function to next greater letter
    //If next greater letter is not found , it returns the 0th index (wrapping)
    private static char FindCeil(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
