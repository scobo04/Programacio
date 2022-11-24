import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("PROVES TEMA 6");

        ArrayList myList;
        myList = new ArrayList();

        myList.add("Sergio");
        myList.add("Paco");
        myList.add("Luis");
        myList.add("Jose");
        myList.add("Ernesto");

        myList.remove(2);
        myList.remove(3);
        myList.remove(myList.size()-1);
        myList.remove("Paco");

        System.out.println(myList);
    }
}