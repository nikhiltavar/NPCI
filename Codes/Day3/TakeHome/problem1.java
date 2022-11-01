package Day3.TakeHome;
import java.util.ArrayList;

public class problem1 {
    public static String[] getWordsContainsPattern(String[] arr, String s){
        ArrayList<String> temp = new ArrayList<String>();

        for (String value : arr) {
            if (value.contains(s)) {
                value = value.toUpperCase();
                temp.add(value);
            }
        }
        String res[] = temp.toArray(new String[temp.size()]);
        return res;
    }
    public static void main(String[] args) {
        String[] words = {"South Africa", "Afghanistan", "Sri Lanka", "New Zealand", "West Indies",
                "England", "India", "Australia", "Pakistan", "Bangladesh"};
        String s = "an";
        String[] res = getWordsContainsPattern(words,s);
        for (String str : res) {
            System.out.println(str);
        }
    }
}
