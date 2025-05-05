package LogicBuildingProblems;

//Given two integers a1 and a2, the first and second terms of an Arithmetic Series respectively,
// the problem is to find the nth term of the series.

//Examples :

//Input : a1 = 2,  a2 = 3,  n = 4
//Output : 5
//Explanation : The series is 2, 3, 4, 5, 6, ....   , thus the 4th term is 5.

//Input : a1 = 1, a2 = 3, n = 10
//Output : 19
//Explanation:  The series is: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21..... Thus,10th term is 19.

public class NthTermOfAnAp {

    //Note Formula = a + (n - 1) + d
    static int findTheNthTerm(int n1, int n2, int nth){
        int diff = n2 - n1;
        return n1 + (nth - 1) * diff;
    }

    public static void main(String[] args) {
        System.out.println(findTheNthTerm(2, 3, 4));
    }

}
