package OOPS.Main;
import OOPS.Encap.Encapintro;

public class Mainclass {
    public static void main(String[] args) {
//        Person p1 = new Person(17,"God");
        Person p2 = new Person();

        Developer d1 = new Developer(89,"nik");
        d1.walk();
        p2.name = "aniket";
        System.out.println(p2.name);

        Encapintro e1 = new Encapintro();
        e1.doWork();
    }
}
class Developer extends Person{
    Developer(int age,String name){
        super(age, name);
    }
    void walk(){
        System.out.println("Dev "+name+" walking...");
    }
}
