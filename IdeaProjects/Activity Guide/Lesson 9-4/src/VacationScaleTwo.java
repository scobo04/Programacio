import java.util.ArrayList;

public class VacationScaleTwo {
    int yearsOfService;
    ArrayList vacationDays;

    public void setVacationScale() {
        vacationDays = new ArrayList(7);
        vacationDays.add(10);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(20);
        vacationDays.add(20);
        vacationDays.add(25);
    }
    public void displayVacationDays() {
        for (int years = 0; years < vacationDays.size(); years++){
            System.out.println("Las vacaciones por " + years + " años de trabajo son: " + vacationDays.get(years));
        }
    }
}
