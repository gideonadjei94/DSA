package LogicBuildingProblems;

public class IsEvenOrOdd {

//    static boolean isEven(int num){
//        return num % 2 == 0;
//    }

    static boolean isEven(int num) {
        return (num & 1) == 0;
    }

    public static void main(String[] args) {
        int number = 12;
        System.out.println(isEven(number));
    }
}
