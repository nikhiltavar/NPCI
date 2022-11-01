package Day2.Guided;

public class problem2 {
    public static int validateInputs(int[] arr,int n){
        if (arr.length==0) return -1;
        for (int j : arr) {
            if (j <= 0) {
                return -2;
            }
        }
        if (n<=0) return -3;
        return 1;
    }
    public static Boolean containsConsecutiveElements(int[] arr, int n){
        if (validateInputs(arr,n)==1){
            for(int i=1; i<=arr.length; i++){
                for(int j=0; j+i<= arr.length; j++){
                    int count = 0;
                    int sum = 0;
                    while(count != i){
                        sum += arr[j+count];
                        count++;
                    }
                    if(sum == n){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(containsConsecutiveElements(arr,8));
    }
}
