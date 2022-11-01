package Day2.Takehome;

public class problem1 {
    public static int getSumOfModifiedElements(int[] arr){
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                arr[i] = arr[i]*2;
            } else {
                arr[i] = arr[i]/2;
            }
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;

    }
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println(getSumOfModifiedElements(arr));
    }
}
