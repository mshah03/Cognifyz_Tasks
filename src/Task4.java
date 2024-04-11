package Cognifyz_Tasks.src;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("---------------------");
        System.out.println("Choose conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                celsiusToFahrenheit();
                break;
            case 2:
                fahrenheitToCelsius();
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        scanner.close();
    }

    public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius: " + celsius);
        scanner.close();
    }
}
