package LogicBuildingProblems;


//You are given a cubic dice with 6 faces. All the individual faces have a number printed on them.
// The numbers are in the range of 1 to 6, like any ordinary dice.
// You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.

//Input: n = 2
//Output: 5
//Explanation: For dice facing number 5 opposite face will have the number 2.

//Input: 6 = 6
//Output: 1
//Explanation: For dice facing number 6 opposite face will have the number 1.

public class TheDiceProblem {

    static int findTheOpposite(int num){

//        int oppositeFace = 7 - num;
//        return oppositeFace;


        int[] dice = {1, 2, 3, 4, 5, 6};
        int oppositeFace = 0;

            for(int i = 0; i < dice.length; i++){
                if(dice[i] == num){
                    oppositeFace = dice[dice.length - 1 - i];
                }
            }
            return oppositeFace;
    }


    public static void main(String[] args) {
        int num = 6;
        System.out.println(findTheOpposite(num));
    }

}
