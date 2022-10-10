public class Person {
    public int years = 18;
    public int days = 0;
    public long minutes = 0;
    public long seconds = 0;
    public long milliseconds = 0;

    public void displaycalculateAge() {
        days = years * 365;
        seconds = days * 24 * 60 * 60;
        minutes = seconds / 60;
        milliseconds = seconds * 1000;

        System.out.println("Teniendo " + years + " años de edad tienes:");
        System.out.println("------------------------------------------");
        System.out.println(days + " días de edad");
        System.out.println(minutes + " minutos de edad");
        System.out.println(seconds + " segundos de edad");
        System.out.println(milliseconds + " milisegundos de edad.");
    }
}
