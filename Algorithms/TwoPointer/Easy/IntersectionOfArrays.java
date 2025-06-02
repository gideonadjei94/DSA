package Algorithms.TwoPointer.Easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

    static int getNumberOfInterSections(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();

        for (int num : a){
            set.add(num);
        }

        int numOfIntersections = 0;

        for (int num : b){
            if (set.contains(num)){
                numOfIntersections++;
                set.remove(num);
            }
        }

        return numOfIntersections;
    }

    public static void main(String[] args) {
        int[] a = {89, 24, 75, 11, 23};
        int[] b = {89, 2, 4};

        System.out.println(getNumberOfInterSections(a, b));
    }
}
