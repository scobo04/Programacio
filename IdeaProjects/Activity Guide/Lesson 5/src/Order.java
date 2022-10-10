public class Order {
    public long orderValue = 0;
    public int itemQuantity = 5;
    public int itemPrice = 14;

    public void displaycalculateTotal() {
        orderValue = (long)itemQuantity * itemPrice;
        System.out.println("Total del pedido: " + orderValue + " €");
    }
}
