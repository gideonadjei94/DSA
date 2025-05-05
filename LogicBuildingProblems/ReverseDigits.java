package LogicBuildingProblems;

public class ReverseDigits {

    //Given an Integer n, find the reverse of its digits.
    //
    //Examples:
    //
    //Input: n = 122
    //Output: 221
    //Explanation: By reversing the digits of number, number will change into 221.
    //
    //
    //Input: n = 200
    //Output: 2
    //Explanation: By reversing the digits of number, number will change into 2.

    static int reverseDigit(int num){
        int reversedNum = 0;

        while (num > 0){
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }

        return reversedNum;
    }

    public static void main(String[] args) {
        int number = 54321;
        System.out.println(reverseDigit(number));
    }
}
