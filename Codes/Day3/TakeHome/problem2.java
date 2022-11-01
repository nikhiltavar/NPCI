package Day3.TakeHome;

public class problem2 {
    public static int convertMMMtoMM(String str){
        str = str.toLowerCase();
        if (str.contains("jan")) return 1;
        if (str.contains("feb")) return 2;
        if (str.contains("mar")) return 3;
        if (str.contains("apr")) return 4;
        if (str.contains("may")) return 5;
        if (str.contains("jun")) return 6;
        if (str.contains("jul")) return 7;
        if (str.contains("aug")) return 8;
        if (str.contains("sep")) return 9;
        if (str.contains("oct")) return 10;
        if (str.contains("nov")) return 11;
        if (str.contains("dec")) return 12;
        return 0;
    }
    public static int getSumOfDigits(String n){
        int sum=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)!='/'){
                /*Sum of all the digits in the DOB*/
                sum=sum+Integer.parseInt(String.valueOf(n.charAt(i)));
            }
        }
        return sum;
    }
    public static int getLuckyNumber(String str){
        String[] arrOfStr = str.split("-");
        int mon = convertMMMtoMM(arrOfStr[1]);
        String res = arrOfStr[0]+mon+arrOfStr[2];
        return getOneDigit(getSumOfDigits(res));
    }
    public static int getOneDigit(Integer number){
        int result=number;
        while(number.toString().length()>1){
            result=0;
            for(int i=0;i<number.toString().length();i++){
                result=result+Integer.parseInt(String.valueOf(number.toString().charAt(i)));
            }
            number=result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getLuckyNumber("15-March-2016"));
    }
}
