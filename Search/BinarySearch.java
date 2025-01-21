package Search;

public class BinarySearch {

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetIndex = BinarySearch(numbers, 6);
        System.out.println(targetIndex);
    }

    static int BinarySearch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(array[mid] > target){
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
