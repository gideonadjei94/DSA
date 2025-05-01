package LogicBuildingProblems;

public class SwapTwoNumbers {

    static void swapNumbers(int a, int b){
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
