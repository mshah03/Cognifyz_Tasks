package Cognifyz_Tasks.src;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int correctNo = rand.nextInt(100); //generates a random number in the range of 0 to 100(exclusive)
        int attempts = 0;
        System.out.println("\nWelcome to Guess the Number !!!\n");

        while (true) {
            System.out.print("Guess the number between 0 to 99 : ");
            int guessNo = sc.nextInt();
            attempts++;

            if (guessNo < correctNo) {
                System.out.println("You have made a lower guess! Try Again.\n");
            } else if (guessNo > correctNo) {
                System.out.println("You have made a higher guess! Try Again.\n");
            } else {
                System.out.println("Congratulations! You have guessed the correct number in " + attempts + " attempts.");
                break;
            }
        }
    }
}
