package Search;

public class LinearSearch {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int index = LinearSearch(numbers, 5);
    System.out.println(index);
  }

  static int LinearSearch(int[] arr, int target){
    int targetIndex = -1;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == target){
         return targetIndex = i;
      }
    }

    return targetIndex;
  }
}
