public class Customer {
    int customerID = 0;
    String name;
    String emailAddress;

    public void displayCustomerInfo() {
        System.out.println("********Customer Information********");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Name:" + name);
        System.out.println("Email: " + emailAddress);
        System.out.println("************************************");
    }
}