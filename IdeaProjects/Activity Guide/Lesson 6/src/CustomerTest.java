public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1, cust2;
        cust1 = new Customer();
        cust2 = new Customer();

        cust1.customerID = 1;
        cust2.customerID = 2;

        cust1.name = "Paco";
        cust2.name = "Maria";

        cust1.emailAddress = "pacopaquitopaco@gmail.com";
        cust2.emailAddress = "mariadelao@gmail.com";

        cust1.displayCustomerInfo();
        cust2.displayCustomerInfo();
    }
}
