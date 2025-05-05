package LogicBuildingProblems;

public class PrimeTest {

    static boolean isPrime(int num){
        int divisors = 1;

        if(num <= 1){
            return false;
        }

        for(int i = 2; i <= num / 2; i++){
            if((num % i) == 0){
                divisors++;
            }
        }
            return  divisors == 1;
        }



    public static void main(String[] args) {
        int number = 9;
        System.out.println(isPrime(number));
    }
}

