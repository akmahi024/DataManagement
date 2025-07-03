import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.print("What is your name? \n> ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "!");


        
        Random rand = new Random();

        System.out.println("Rolling dice...");

        int die1 = rand.nextInt(6) + 1; // Generates a number from 1 to 6
        int die2 = rand.nextInt(6) + 1; // Generates a number from 1 to 6
        int total = die1 + die2;

        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + total);

        if (total > 7) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost.");
        }
        scanner.close();
    }
}
