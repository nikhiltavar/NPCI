package Day3.TakeHome;

public class problem1 {
    public static String reverse(String str){
        if (str==null) return null;
        if (str.isEmpty()) return null;
        String[] words =str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord += sb +" ";
        }
        return reverseWord.trim();
//        return str;
    }
    public static void main(String[] args) {
        System.out.println(reverse("talent sprint"));
    }
}
