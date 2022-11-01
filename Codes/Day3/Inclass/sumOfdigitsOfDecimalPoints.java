package Day3.Inclass;

public class sumOfdigitsOfDecimalPoints {
    public static int getSumOfDigits(int n){
        int sum=0;
        while (n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static String concateSumOfDigits(double n){
        String[] decpoints = (""+n).split("[.]");

        int leftSum = getSumOfDigits(Integer.parseInt(decpoints[0]));
        int rightSum = getSumOfDigits(Integer.parseInt(decpoints[1]));

        return  leftSum+":"+rightSum;

    }
    public static void main(String[] args) {
        System.out.println(concateSumOfDigits(142.52));
    }
}
