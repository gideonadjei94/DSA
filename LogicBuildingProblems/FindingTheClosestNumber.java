package LogicBuildingProblems;

//Given two integers n and m (m != 0). Find the number closest to n and divisible by m.
// If there is more than one such number, then output the one having maximum absolute value.

//Input: n = 13, m = 4
//Output: 12
//Explanation: 12 is the closest to 13, divisible by 4.

//Input: n = -15, m = 6
//Output: -18
//Explanation: Both -12 and -18 are closest to -15, but-18 has the maximum absolute value.

public class FindingTheClosestNumber {

    static int findClosestNumber(int n, int m){
        int q = n / m;

        int n1 = m * q;

        int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));

        if(Math.abs(n - n1) < Math.abs(n - n2))
            return n1;
        return n2;
    }

    public static void main(String[] args) {
        int n = -15;
        int m = 6;

        System.out.println(findClosestNumber(n, m));
    }
}
