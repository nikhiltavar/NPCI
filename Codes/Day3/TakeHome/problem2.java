package Day3.TakeHome;

public class problem2 {
    public static void main(String[] args) {
        String s = "1aBc4D6";
        System.out.println(isPositivString(s));
    }
    static boolean isPositivString(String str) {
        if(str == null) return false;
        if(isValidString(str)){
            str = str.toLowerCase();
            for(int i = 0 ;i<str.length()-1;i++){
                if(!(str.charAt(i) < str.charAt(i+1))) return false;
            }
        }else{
            return false;
        }
        return true;
    }
    static boolean isValidString(String str){
        if(str.matches("[a-zA-Z]+")) return true;
        return false;
    }
}
