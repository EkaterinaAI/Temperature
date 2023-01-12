import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // F = C * 1.8 + 32
        System.out.println("\t\t\t***Добро пожаловать в конвертор температуры***");

        System.out.println("Введите температуру в °C:");
        double tempCelsius = new Scanner(System.in).nextDouble();

        double coof1 = 1.8;
        int coof2 = 32;

        System.out.println(tempCelsius + "°C = " + (tempCelsius * coof1 + coof2) + "°F");
    }
}
