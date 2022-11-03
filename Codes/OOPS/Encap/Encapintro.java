package OOPS.Encap;

public class Encapintro {
    public void doWork(){
        System.out.printf("Working from encap");

    }
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(45);
        System.out.println(l1.getPrice());

    }

}
class Laptop{
    int ram;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        boolean isAdmin = true;
        if (!isAdmin){
            System.out.println("No you cant");
        } else {
            this.price = price;
        }
    }
}
