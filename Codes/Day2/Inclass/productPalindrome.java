package Day2.Inclass;

public class productPalindrome {
    public static int getCount(int s,int e){
        if(e >1000) return -1;
        if (s<0||e<0) return -2;
        if (s>e) return 0;
        int count=0;
        for (int i=s;i<=e;i++){
            for (int j=s;j<=e;j++){
                if(isPalindrome(i*j)){
                    count++;
                }
            }
        }

        return count;
    }
    public static Boolean isPalindrome (int n){
        int res=0;
        int temp =n ;
        while (n>0){
            int i = n%10;
            res = res*10 + i;
            n = n/10;
        }
        return res == temp;
    }
    public static void main(String[] args) {
        System.out.println(getCount(1000,100));
    }
}
