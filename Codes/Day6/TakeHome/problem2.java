package Day6.TakeHome;

public class problem2 {
    public static void main(String[] args) {
        MyCalculator m1 = new MyCalculator();
        System.out.println(m1.divisorSum(6));
    }
}

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i=1;i<=n;i++) {
            if (n%i==0){
                sum += i;
            }
        }
        return sum;
    }
}
