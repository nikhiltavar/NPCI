package day1;

public class quadraticSequence {
    public static String getQuadraticSequence(int n){
        if (n<=0){
            return null;
        }
        int sum=1;
        String res = sum +"";
        for (int i=2;i<=n;i++){
            sum+=i;
            res = res +", "+sum;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getQuadraticSequence(20));
    }
}
