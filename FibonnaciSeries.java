public class FibonnaciSeries {

    public static void main(String[] args) {
        fibonacci(1,0);
    }

    private static void fibonacci(int prev1, int prev2) {
        int numOfTimes = 10;
        int newFibo = 0;

        for (int i = 0; i <= numOfTimes - 2; i++){
         newFibo = prev1 + prev2;
        System.out.print(newFibo + ", ");
        prev2 = prev1;
        prev1 = newFibo;
        }

    }
}
