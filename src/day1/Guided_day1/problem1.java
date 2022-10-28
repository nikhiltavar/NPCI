package day1.Guided_day1;

public class problem1 {
    public static int power(int x,int y)
    {
        if (y == 0)
            return 1;
        else if (y%2 == 0)
            return power(x, y/2)
                    *power(x, y/2);
        else
            return x*power(x, y/2)
                    *power(x, y/2);
    }
    public static int getCountOfLeftTruncatablePrimes(int start, int end){
        int count = 0;
        if (start>end) return -1;
        if (start <0) return -2;
        if (start ==0 || end==0) return -3;
        for (int i=start;i<=end;i++){
            if (isLeftTruncatablePrime(i)){
                count++;
            }
        }
        return count;
    }
    public static Boolean isPrime(int n){
        if (n<=1) return false;
        for (int i=2;i<n;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static Boolean isLeftTruncatablePrime(int n){
        int temp = n, count = 0, temp1;
        while (temp != 0)
        {
            count++;
            temp1 = temp%10;
            if (temp1 == 0)
                return false;
            temp = temp/10;
        }
        for (int i = count; i > 0; i--){
            int mod =  power(10,i);

            if (!isPrime(n%mod))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(getCountOfLeftTruncatablePrimes(1,500));
    }
}
