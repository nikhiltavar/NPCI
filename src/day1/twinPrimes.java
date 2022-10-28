package day1;

public class twinPrimes {
    public static Boolean isPrime(int n){
        if (n==1) return false;
        for (int i=2;i<n;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static String getTwinPrimes(int a,int b){
        if (a<0 || b<0 || a>100 || b>100 ||a>=b){
            return "Errorr";
        }
        String res = "";
        for (int i=a;i<b-1;i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                res += i + ", " + (i + 2) + "; ";
            }
        }

        if (res.length()==0){
            return "No twin primes found";
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(getTwinPrimes(1,50));
    }
}
