public class ClassMapTest {
    public static void main(String[] args) {
        ClassMap Name = new ClassMap();

        //Inicialitza la variable
        Name.setClassMap();

        //Primer estudiant
        Name.name = "Ana";
        Name.setDesk();

        //Segon estudiant
        Name.name = "Verónica";
        Name.setDesk();

        //Tercer estudiant
        Name.name = "Mario";
        Name.setDesk();

        //Quart estudiant
        Name.name = "Miguel";
        Name.setDesk();

        Name.setClassMap();
    }
}
