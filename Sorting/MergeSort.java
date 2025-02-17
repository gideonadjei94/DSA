package Sorting;

public class MergeSort {

    private static void mergerSort(int[] arr, int l, int r) {
        
        if(l < r){
            int mid = (l + r)/ 2;
            mergerSort(arr, l, mid);
            mergerSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int lSize = mid - l + 1;
        int rSize = r - mid;
        int[] leftArray = new int[lSize];
        int[] rightArray = new int[rSize];

        for(int x = 0; x < lSize; x++){
            leftArray[x] = arr[l + x];
        }

        for(int x = 0; x < rSize; x++){
            rightArray[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < lSize && j < rSize){

            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        while (i < lSize){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rSize){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 1, 6, 7};

        mergerSort(arr, 0, arr.length - 1);
         for(int n : arr){
             System.out.print(n + ", ");
         }
    }


}
