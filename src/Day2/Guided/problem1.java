package Day2.Guided;

public class problem1 {
    public static int[] rotateNum(int[] arr,int n){
        if (arr==null) return null;
        int l= arr.length;
        int k = arr.length-n;
        int[] temp=new int[l];
        for(int i=0;i<l;i++)
        {
            temp[i]=arr[(i+k)%l];
        }
        for(int j=0;j<l;j++)
        {
            arr[j]=temp[j];
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] res = rotateNum(arr,0);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
