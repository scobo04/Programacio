public class Temperature {
    public float fahrenheitTemperature = 78.9F;

    public void calculateCelsius() {
        System.out.println("La temperatura total en Celsius es: " + (fahrenheitTemperature - 32) * 5 / 9);
    }
}
