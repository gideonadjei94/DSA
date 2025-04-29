package LogicBuildingProblems;

import java.util.Scanner;

public class MultiplicationTable {

     static void printTable(int n){
         for (int i = 1; i <= 10; i++){
             System.out.println(n + " * " + i + " = " + (i * n));
         }
     }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        printTable(number);
    }
}
