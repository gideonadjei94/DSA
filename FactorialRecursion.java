public class FactorialRecursion {

    public static void main(String[] args) {
        long result  = fact(6);
        System.out.println(result);
    }

    private static long fact(int i) {
        if(i == 0 || i == 1){
            return 1;
        }

        return i * fact(i - 1);
    }

}
