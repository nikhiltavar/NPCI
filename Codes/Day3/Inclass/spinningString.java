package Day3.Inclass;

public class spinningString {
    public static String rotateString(String s,int n){
        int l=s.length();
        String res = s.substring(l-n)+ s.substring(0,l-n);

        return res;
    }
    public static void main(String[] args) {
        System.out.println(rotateString("Nikhil",3));
    }
}
