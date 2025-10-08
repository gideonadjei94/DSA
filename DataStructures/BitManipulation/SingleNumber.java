package DataStructures.BitManipulation;

public class SingleNumber {

    static  int findSingleNumber(int[] nums){
        int result = 0;
        for(int num : nums){
            result ^= num;
        }

        return  result;
    }


    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(findSingleNumber(nums));
    }

}
