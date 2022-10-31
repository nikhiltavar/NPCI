package Inclass;

public class oddPalindrome {
    public static Boolean isPalindrome (int n){

        int res=0;
        int i=0;
        while (n>0){
            i = n%10;
            res = res*10 + i;
            n = n/10;
        }
        System.out.println(n);
        return res == n;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(3422));
    }
}
