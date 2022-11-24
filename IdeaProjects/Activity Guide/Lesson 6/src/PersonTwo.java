public class PersonTwo {
    StringBuilder name = new StringBuilder(8);
    StringBuilder phoneNumber = new StringBuilder();

    public void displayPersonInfo() {
        name.append("Fernando");
        name.append(" ");
        name.append("Gonzalez");

        phoneNumber.append("123987456");
        phoneNumber.insert(3, "-");
        phoneNumber.insert(7, "-");

        System.out.println("Name: " + name.toString());
        System.out.println("Name object capacity: " + name.capacity());
        System.out.println("Phone number: " + phoneNumber.toString());
    }
}
