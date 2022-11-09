package Day7.Takehome;

import java.util.ArrayList;
import java.util.HashSet;

class CabCustomer{
    int custId;
    String customerName;
    String pickupLocation;
    String dropLocation;
    int distance;
    long phone;

    public CabCustomer() {
    }

    public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
                       long phone) {

        this.custId = custId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.phone = phone;

    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

}

class CabCustomerService{

    ArrayList<CabCustomer> customerList = new ArrayList<>();
    HashSet<Long> phoneSet = new HashSet<>();

    public void addCabCustomer(CabCustomer customer){
        if(isNewCustomer(customer)){
            this.customerList.add(customer);
            this.phoneSet.add(customer.phone);
            return;
        }
    }

    public boolean isNewCustomer(CabCustomer customer){
        if(this.phoneSet.contains(customer.phone)){
            return false;
        }

        customer.setDistance(0);
        return true;
    }

    public double calculateBill(CabCustomer customer) {
        if(customer.distance == 0)
            return 0.0;

        double extraDistance = Math.max(0, customer.distance - 4);
        double bill = extraDistance*6 + 80;

        return bill;
    }

    public void printBill(CabCustomer customer){
        System.out.println(customer.customerName + " Please pay your bill of Rs." + calculateBill(customer));
    }
}

public class CabCustomerServiceTester {

    public static void main(String[] args) {
        CabCustomer nikhil = new CabCustomer(121, "Nikhil Tavar", "Mumbai", "Thane", 23, 996878451 );
        CabCustomer aniket = new CabCustomer(122, "Aniket pawar", "kalyan", "Titwala", 56, 854769324 );

        CabCustomerService service = new CabCustomerService();

        service.addCabCustomer(nikhil);
        service.addCabCustomer(aniket);

        service.printBill(nikhil);
        service.printBill(aniket);

        service.addCabCustomer(nikhil);

        nikhil.setDistance(18);
        nikhil.setPickupLocation("Mumbai");
        nikhil.setDropLocation("Thane");

        service.printBill(nikhil);

    }

}