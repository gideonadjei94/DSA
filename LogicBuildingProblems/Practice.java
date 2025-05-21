package LogicBuildingProblems;

public class Practice {
     static boolean isCorrectTime(String str){
        String[] parts = str.split(":");
        int hrs = Integer.parseInt(parts[0].trim());
        int min = Integer.parseInt(parts[1].trim());

        if (min < 0 || min > 60)
            return false;
        else return hrs >= 1 && hrs <= 12;
     }


    public static void main(String args[]) {
        String str = "11:00";
        System.out.println(isCorrectTime(str));

    }
}
