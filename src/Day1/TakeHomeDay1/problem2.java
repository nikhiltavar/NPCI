package Day1.TakeHomeDay1;

public class problem2 {

    public static String getFourPerLine(int n){
        String res = "";
        if (n<0){
            return "-1";
        } else if (n==0) {
            return "-2";
        } else if (n>99) {
            return "-3";
        }
        for (int i=1;i<=n;i++){
            if (i%4==0) {
                res += i + "\n";
            } else {
                res += i +" ";
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(getFourPerLine(20));
    }
}
