package Day7.Inclass;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashDemo {
    public static void main(String[] args) {
        HashSet<java.io.Serializable> hash = new HashSet<>();
        hash.add("nikhil");
        hash.add(198);
        hash.add(98.32);
        hash.add('h');


        for (Object i:hash){
            System.out.println(i);
        }
        Iterator iter = hash.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
