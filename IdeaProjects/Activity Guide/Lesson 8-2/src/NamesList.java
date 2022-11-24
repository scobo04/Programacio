import java.util.ArrayList;

public class NamesList {
    public ArrayList listOfNames = new ArrayList();

    public void setList() {
        listOfNames.add("Jose");
        listOfNames.add("Miguel");
        listOfNames.add("Pedro");
        listOfNames.add("Maria");
    }

    public void displayArrayList() {
        System.out.println("Lista de nombres: " + listOfNames);
        System.out.println("El tamaño del ArrayList es: " + listOfNames.size());
    }
}
