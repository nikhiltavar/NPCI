package Day2.Inclass;

public class kaprekarNum {
    public static Boolean isKaprekarNumber(int n){
        if (n==0 || n<0 )  return false;
        String sq = (n*n)+"";
        System.out.println(sq);
        int a = Integer.parseInt(sq.substring(0,(sq.length()/2)));
        int b = Integer.parseInt(sq.substring((sq.length()/2)));

        return n == (a + b);
    }
    public static void main(String[] args) {
        System.out.println(isKaprekarNumber(45));
    }
}
