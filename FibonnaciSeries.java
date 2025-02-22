public class FibonnaciSeries {

    public static void main(String[] args) {
        int numOfTimes = 10;
        int count = 0;
        fibonacci(1,0, 0, numOfTimes-2);
    }

    private static void fibonacci(int prev1, int prev2, int count, int numOfTimes) {
        int newFibo = 0;

//        Using a For Loop
//        for (int i = 0; i <= numOfTimes - 2; i++){
//         newFibo = prev1 + prev2;
//        System.out.print(newFibo + ", ");
//        prev2 = prev1;
//        prev1 = newFibo;
//        }


//        Using Recurssion
        if(count < numOfTimes){
            newFibo = prev1 + prev2;
            System.out.print(newFibo + ", ");
            fibonacci(prev2, newFibo, count+1, numOfTimes);
        }
    }
}
