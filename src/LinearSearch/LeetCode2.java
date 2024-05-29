package LinearSearch;

//You are given an 'm x n' integer grid accounts where accounts[i][j]
//is the amount of money the ith customer has in the jth bank. Return the wealth that
//the richest customer has.
//NB: A customer's wealth is the amount of money they have in all their bank accounts
//    The richest customer is the one with the maximum wealth

public class LeetCode2 {
    public static void main(String[] args) {
        int[][] accnt = {{1, 2, 3}, {40, 50, 60}, {7, 8, 9}};
        int max = 0;
        int richest = 0;
        for(int i = 0; i < accnt.length; i++){
            int sum = 0;
            for(int j = 0; j < accnt[i].length; j++){
                sum += accnt[i][j];
            }
            richest = sum > max? (i + 1) : richest;
            max = sum > max? sum : max;
        }
        System.out.println("Customer " + richest + " is the wealthiest with a total amount of " + max);
    }
}
