public class Customer {
    public int customerID = 1;
    public char status = 'N';
    public double totalPurchases = 2.0;

    public void displayCustomerInfo() {
        System.out.println("Cliente ID: " + customerID);
        System.out.println("Estado: " + status);
        System.out.println("Número de compras: " + totalPurchases);
    }
}
