package OOPS.Main;

public class Abstraction {
    public static void main(String[] nik) {
        Hero h1 = new Hero();
        h1.start();
    }
}
class Hero extends Car{

    @Override
    void start() {
        System.out.println("Hero is starting");
    }
}

abstract class Car{
    int price;

    abstract void start();
}