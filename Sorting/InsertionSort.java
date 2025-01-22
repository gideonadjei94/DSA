package Sorting;

public class InsertionSort {

    public static void main(String[] args){
        int[] nums = {2, 3, 6, 1, 5};

        System.out.println("Before Sorting: ");
        for (int num : nums){
            System.out.print(num + ", ");
        }

        InsertionSort(nums);

        System.out.println();
        System.out.println("After sorting: ");
        for (int num : nums){
            System.out.print(num + ", ");
        }
    }

    //Takes the current value, compares to the previous value and shifts till it's in the right position
    public static void InsertionSort(int[] arr){
        int key = 0;
        int j = 0;
        for(int i = 1; i < arr.length; i++){
            key = arr[i];
            j = i - 1;

            while( j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
