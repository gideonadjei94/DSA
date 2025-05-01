package LogicBuildingProblems;

// Given a number n, find the sum of the first n natural numbers.
// Note Formula for finding the first n natural sum = n(n + 1)/2
public class FindSum {

    static int findSum(int num){
        if (num % 2 == 0)
            return (num / 2) * (num + 1);
        else
            return num * (num + 1) / 2;

    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(findSum(number));
    }

}
