package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {2, 8, 1, 3, 5, 9, 4, 1};
        BubbleSort(nums);

        System.out.println("After Sorting: ");
        for (int num : nums){
            System.out.print(num + ", ");
        }
    }

    public static void BubbleSort(int[] arr){
        int arraySize = arr.length;
        int temp = 0;

        for (int i = 0; i < arraySize; i++){
            for (int j = 0; j < arraySize - i - 1; j++){
                if (arr[j] > arr[j + 1]){

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
