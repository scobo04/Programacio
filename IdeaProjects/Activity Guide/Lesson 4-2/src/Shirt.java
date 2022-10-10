public class Shirt {
    public int shirtID = 1;
    public String description = "Muy elegante";
    public char colorCode = 'A';
    public double price = 35.99;
    public int quantityInStock = 13;

    public void displayInformation() {
        System.out.println("ID: " + shirtID);
        System.out.println("Descripción: " + description);
        System.out.println("Código de color: " + colorCode);
        System.out.println("Preu: " + price);
        System.out.println("Cantidad en stock: " + quantityInStock);
    }
}