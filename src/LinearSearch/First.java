package LinearSearch;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {18, 12, 9, 14, 77, 50};
        System.out.print("Enter the number to search: ");
        int num = input.nextInt();
        int i = 0;
        int notFound = 0 ;

        for(int n : arr){
            if (num == n){
                System.out.println(num + " exists at index " + i);
            }else{
                notFound++;
                i++;
            }

        }
        if (notFound == arr.length){
            System.out.println(num + " Does not exist.");
        }

    }
}
