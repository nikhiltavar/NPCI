package Day2.Takehome;

public class problem2 {
    public static String createBoxPattern(int r,int c){
        String res = "";
        for (int i = 1; i <= r; i++)
        {
            for (int j = 1; j <= c; j++)
            {
                if (i == 1 || i == r ||
                        j == 1 || j == c)
                    res += "*";
                else
                    res += " ";
            }
            res += "\n";
        }



        return res;
    }
    public static void main(String[] args) {
        System.out.println(createBoxPattern(4,8));
    }
}
