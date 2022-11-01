package Day3.Inclass;

public class AverageWordLength {
    public static int getAverageWordLength(String sentence) {

        if (sentence == null)
            return -1;

        if (sentence.isEmpty())
            return 0;

        int words = sentence.split(" ").length;
        int chars = sentence.length() - (words - 1);

        return chars / words;
    }

    public static void main(String[] args) {
        System.out.println(getAverageWordLength("Hi dad"));
        System.out.println(getAverageWordLength("Hi everyone"));
        System.out.println(getAverageWordLength("How Are You"));
    }
}

