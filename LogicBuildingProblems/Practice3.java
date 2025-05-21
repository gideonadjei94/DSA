package LogicBuildingProblems;

public class Practice3 {
    static int isSubString(String str, String pat) {
        int indexOfOccur = -1;
        int n = str.length();
        int windowSize = pat.length();

        for (int i = 0; i <= n - windowSize; i++) {
            String onFocus = str.substring(i, i + windowSize);
            if (onFocus.equals(pat)) {
                indexOfOccur = i;
                break;
            }
        }

        return indexOfOccur;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String pat = "eks";

        System.out.println(isSubString(str, pat));
    }
}
