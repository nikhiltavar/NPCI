package Day8.Takehome;

class WrongPasswordException extends Exception{


    public WrongPasswordException(String message) {
        super(message);
    }

}

class Validator{

    public boolean validatePassword(String password) throws WrongPasswordException{
        int length = password.length();
        if(length < 8){
            throw new WrongPasswordException("The length of password should be of minimum 8 characters");
        }
        int lowerCase = 0;
        int upperCase = 0;
        int digit = 0;
        int symbol = 0;

        for(int i=0; i<length ;i++){
            char ch = password.charAt(i);

            if(Character.isAlphabetic(ch)){
                if(Character.isUpperCase(ch)){
                    upperCase++;
                }
                else
                    lowerCase++;
            }
            else if (Character.isDigit(ch))
                digit++;
            else
                symbol++;

        }

        if(upperCase < 1){
            throw new WrongPasswordException("The password should contain atleast 1 upper case character");
        }
        else if (lowerCase < 2){
            throw new WrongPasswordException("The password should contain atleast 2 lower case characters");
        }
        else if(digit < 1){
            throw new WrongPasswordException("The password should contain atleast 1 numerical(digit) character");
        }
        else if(symbol < 1){
            throw new WrongPasswordException("The password should contain atleast 1 symbol character");
        }

        return true;
    }

}

public class TestPassword {

    public static void main(String[] args) throws WrongPasswordException{
        Validator password = new Validator();
        System.out.println(password.validatePassword("Nikhil@c89"));
        System.out.println(password.validatePassword("Nikhilnikhil"));

    }

}

