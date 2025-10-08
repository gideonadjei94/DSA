package DataStructures.Arrays;

import java.util.*;

public class TopKFrequentElements {

    static int[] topKFrequentElements(int[] nums, int k){
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        // creating the frequency array
        for(int i  = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        // fill count map
        for (int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // fill freq with count map
        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        // set resulting array with top freq elements
        int[] res = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i > 0 && index < k; i-- ){
            for(int n : freq[i]){
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        System.out.println(Arrays.toString(topKFrequentElements(nums, 2)));
    }
}
