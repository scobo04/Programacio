public class VacationScaleTest {
    public static void main(String[] args) {
        VacationScale vacationDays = new VacationScale();

        vacationDays.setVacationScale();
        vacationDays.yearsOfService = 1;
        vacationDays.displayVacationDays();

        vacationDays.yearsOfService = 5;
        vacationDays.displayVacationDays();

        vacationDays.yearsOfService = 10;
        vacationDays.displayVacationDays();
    }
}
