package Lesson7;

public class TemperatureConverter {
    public static double FahrenheitCelsius(double value) {
        double result = (value - 32) / 1.8;
        result = Math.round(result * 10);
        return result / 10;
    }
}
