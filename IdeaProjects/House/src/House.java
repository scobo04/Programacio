public class House {
    public String name;
    public int rooms;
    public int bathrooms;
    public boolean garage;
    public int price;

    public void displayHouse() {
        System.out.println("-----------------------");
        System.out.println("Nom: " + name);
        System.out.println("Habitacions: " + rooms);
        System.out.println("Banys: " + bathrooms);
        System.out.println("Garatge: " + garage);
        System.out.println("Preu: " + price);
    }
}