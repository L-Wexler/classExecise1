import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ICustomer> customerList = new ArrayList<>();
        customerList.add(new StandardCustumer(1 ,"cust1"));
        customerList.add(new GoldCustomer(2 ,"cust1"));
        customerList.add(new StandardCustumer(3 ,"cust1"));
        customerList.add(new SilverCustomer(4 ,"cust1"));
        customerList.add(new SilverCustomer(5 ,"cust1"));
        customerList.add(new StandardCustumer(6 ,"cust1"));
        customerList.add(new GoldCustomer(7 ,"cust1"));
        customerList.add(new StandardCustumer(8 ,"cust1"));
        customerList.add(new SilverCustomer(9 ,"cust1"));
        customerList.add(new StandardCustumer(10 ,"cust1"));

        for (ICustomer customer : customerList){
            System.out.println("name: " + customer.getCustomerName() + " 300:" + customer.getPriceForProduct(300) + "3800: " + customer.getPriceForProduct(3800));
        }
    }
}