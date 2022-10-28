package day1.Guided_day1;

public class problem2 {
    public static int getProduct(int num1, int num2){
        int sum = 0;
        while (num1>0){
            if (num1%2!=0){
                sum += num2;
            }
            num1/=2;
            num2*=2;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(getProduct(9,5));
    }
}
