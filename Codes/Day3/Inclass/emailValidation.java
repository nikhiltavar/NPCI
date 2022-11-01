package Day3.Inclass;

public class emailValidation {
    public static String isValidMailID(String str){
        if (Character.isUpperCase(str.charAt(0)))
            return "Invalid";
        if (str.indexOf('@')==-1){
            return "Invalid";
        }
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='@'){
                count++;
            }
        }
        if (count>1) return "Invalid";

        if (!(str.endsWith(".com") || str.endsWith(".co.in"))){
            return "Invalid";
        }

        return "Valid";
    }
    public static void main(String[] args) {
        System.out.println(isValidMailID("nikhil@gmail.co.in"));
    }
}
