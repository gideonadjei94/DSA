package Questions;

public class q1 {


    public static void main(String[] args){
        int[] nums = {-5, 1, 4, 2, 12};
        printAlternative(nums);
    }

    private static void printAlternative(int[] arr){
        for (int i = 0; i < arr.length ; i+=2){
            System.out.print(arr[i] + ", ");
        }
    }
}
