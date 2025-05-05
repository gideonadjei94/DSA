package LogicBuildingProblems;

//Given a number n, find the sum of its digits.

//Examples :
//Input: n = 687
//Output: 21
//Explanation: The sum of its digits are: 6 + 8 + 7 = 21

//Input: n = 12
//Output: 3
//Explanation: The sum of its digits are: 1 + 2 = 3

public class SumOfDigitsOfANumber {

    static int findSum(int number){
        int sum = 0;
        while (number != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 687;
        System.out.println(findSum(num));
    }
}
