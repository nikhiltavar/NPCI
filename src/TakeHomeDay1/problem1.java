package TakeHomeDay1;

import java.util.Arrays;

public class problem1 {
    public static int findSecondMaxDigit(int n){
        int temp = n;
        int[] a = new int[4];
        int i = 0;
        int res = 0;
        while(temp != 0){
            a[i] = temp % 10;
            i++;
            temp /= 10;
        }
        Arrays.sort(a);

        for (int j = a.length-1;j>=0;j--){
            if (a[j] < 0 || a[j] == 0) {
                res = -1;
                break;
            }
        }

        if((a[a.length-1] == a[0]) && a[a.length-1] != 0){
            res = 0;
        }
        if(a[a.length-1] != a[a.length-2]) {
            res = a[a.length-2];
        }
        return res;
    }



    public static void main(String[] args) {
        System.out.println(findSecondMaxDigit(145));
    }
}
