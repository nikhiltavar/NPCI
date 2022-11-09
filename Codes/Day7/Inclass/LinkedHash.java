package Day7.Inclass;

import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<java.io.Serializable> lhash = new LinkedHashSet<java.io.Serializable>();
        lhash.add("nikhil");
        lhash.add(83);
        lhash.add(98.32);
        lhash.add('h');
        for (Object i:lhash){
            System.out.println(i);
        }
    }
}
