import java.util.ArrayList;

public class NamesListTwo {
    ArrayList listOfNames = new ArrayList();

    public void setList() {
        listOfNames.add("Jose");
        listOfNames.add("Miguel");
        listOfNames.add("Pedro");
        listOfNames.add("Maria");
    }

    public void displayNames() {
        System.out.println("Nombres del ArrayList: ");
        for (Object name : listOfNames) {
            System.out.println(name);
        }
    }
}
