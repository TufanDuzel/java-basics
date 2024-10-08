import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer Tufan = new Customer(1,"Tufan", "Düzel");
        customers.remove(Tufan);

        //customers.add(new Customer(1,"Tufan", "Düzel"));
        customers.add(new Customer(2,"Şahin", "Düzel"));
        customers.add(new Customer(3,"Düzel", "Düzel"));

        for (Customer customer:customers) {
            System.out.println(customer.firstName);
        }
    }
}