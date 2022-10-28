package TakeHomeDay1;

public class problem3 {
    public static Boolean isAmicable(int a,int b){
        return getSumOfProperDivisors(a) == b && getSumOfProperDivisors(b) == a;
    }
    public static int sumOfAmicablePairs(int start,int end){
        int sum=0;
        for (int i=start;i<end;i++){
            for (int j = start+1; j <=end; j++){
                if (i!=j) {
                    if (isAmicable(i, j)) {
                        sum += i + j;

                    }
                }
            }
        }

        return sum/2;
    }
    public static int getSumOfProperDivisors(int n){
        int sum =0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
//        System.out.println(getSumOfProperDivisors(496));
        System.out.println(sumOfAmicablePairs(100,10000));
//        System.out.println(isAmicable(496,496));

    }
}
