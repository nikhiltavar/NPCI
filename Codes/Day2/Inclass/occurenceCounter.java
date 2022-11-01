package Day2.Inclass;
public class occurenceCounter {
    public static int getCount(int[] arr,int n){
        int count=0;
        for (int j : arr) {
            if (j == n) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6,3,6,7,8,4,7,3,5,7,-9,-45};
        System.out.println(getCount(arr,45));
    }
}