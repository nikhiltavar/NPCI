package Day1.inclass;

public class adamNumber {

    public static int sq(int n){
        return n*n;
    }
    public static int revNum(int n){
        int res=0;
        int i=0;
        while (n>0){
            i = n%10;
            res = res*10 + i;
            n = n/10;
        }
        return res;
    }
    public static Boolean isAdamNumber(int n){
        //intput = 12
        int rn = revNum(n); // 21
        int sn = sq(n); // 144
        int rsn = revNum(sq(n)); // 441

        if(sq(n) == revNum(revNum(sq(n)))) {
            return true;
        } else{
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(revNum(598));
        System.out.println(isAdamNumber(17));
    }
}
