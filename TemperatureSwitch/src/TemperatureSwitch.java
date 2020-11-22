import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class TemperatureSwitch {
    public static double fahrenheitToCelsius (double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static double celsiusToFahrenheit (double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit!");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter a fahrenheit:");
                    fahrenheit = Double.parseDouble(sc.nextLine());
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter a celsius:");
                    celsius = Double.parseDouble(sc.nextLine());
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Not found!");
            }
        } while (choice != 0);

    }
}

