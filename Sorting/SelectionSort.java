package Sorting;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {2, 8, 1, 3, 5, 9, 4, 12};
        SelectionSort(arr);

        System.out.println("After Sorting: ");
        for(int num : arr){
            System.out.print(num + ", ");
        }
    }

    //Takes a value and compares to the values ahead and then swaps when needed
    public static void SelectionSort(int[] arr){
        int temp = 0;
        int minIndex = -1;
        int arraySize = arr.length;

        for(int i = 0; i < arraySize - 1; i++){
            minIndex = i;
            for (int j = i + 1; j < arraySize; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
