import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Rolling dice...");

        int die1 = rand.nextInt(6) + 1; // Generates a number from 1 to 6
        int die2 = rand.nextInt(6) + 1; // Generates a number from 1 to 6
        int total = die1 + die2;

        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + total);
    }
}
