package OOPS.Main;

public class Person {
    protected String name;
    int age;
    static int count;

    Person() {
        count++;
        System.out.println("contructor calling");
    }

    Person(int age, String name) {
        this();
        this.name = name;
        this.age = age;
    }

    void walk() {
        System.out.println(name + " walks");
    }

    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps");
        System.out.println(count);
    }
}
