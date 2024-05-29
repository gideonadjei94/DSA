package LinearSearch;

//Given an array NUMS of INTEGERS , return how many of them contain an even number
// of digits try with [12, 345, 2, 6, 7896]
public class LeetCode1a {
    public static void main(String[] args) {
        int evenDigitNums = 0;
        int[] nums = {12, 345, 2, 6, 7896};
        for(int i = 0; i < nums.length; i++){
            int counter = 0;
            if (nums[i] < 0){
                nums[i] *= -1;
            }

            if (nums[i] == 0){
                nums[i] += 1;
            }

            while(nums[i] > 0){
                nums[i] /= 10;
                counter++;
            }
            if ((counter & 1) == 0){
                evenDigitNums++;
            }
        }
        System.out.println(evenDigitNums);
    }
}
