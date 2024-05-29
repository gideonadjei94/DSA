package BinarySearch;

import java.util.Scanner;

public class _Try {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        FindFact(num);
    }

    private static void FindFact(int num) {
        int fact = 1;
        if(num == 0){
            System.out.println(num + " fatorial = " + fact);
        }else{
            int num1 = num;
            for(int i = 0; i < num1; i++){
                fact *= num;
                num--;
            }
            System.out.println(num1 + "! = " + fact);
        }
    }
}
