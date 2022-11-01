package Day2.Inclass;

public class oddPalindrome {
    public static Boolean isPalindrome (int n){
        int res=0;
        int temp =n ;
        while (n>0){
            int i = n%10;
            res = res*10 + i;
            n = n/10;
        }
//        System.out.println(res);
        return res == temp;
    }
    public static String oddPalindromerange(int s,int e){
        String res = "";

        for (int i=s;i<=e;i++){
            if (isPalindrome(i)) {
                res += i+" ";
            }
        }
        return res;

    }
    public static void main(String[] args) {
        System.out.println(oddPalindromerange(100,300));
    }
}
