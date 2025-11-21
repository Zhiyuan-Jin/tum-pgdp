package pgdp.game;

import pgdp.InputReader;
import pgdp.RandomNumberGenerator;

public class GuessTheNumber {
    int upperBound;
    int maxAttempts;
    int rewardPoints;
    int rewardLives;


    public void guessTheNumber() {
        // TODO
        int lives = 3;
        int points = 0;
        System.out.println("Hello, Number Detective!");
        System.out.println("You have 3 lives and 0 points.");
        printMenu();
        while (true) {
            if (lives > 0) {
                System.out.println("You have " + lives + " lives and " + points + " points.");
                printMenu();
                int choice = InputReader.readInt();
                if (choice == 4) {
                    System.out.println("Goodbye!");
                    System.out.println("You are leaving with " + points + " points!");
                    return;
                }
                if (choice < 1 || choice > 4) {
                    System.out.println("This was not a valid choice, please try again.");
                }
                if (choice == 1) {
                    upperBound = 100;
                    maxAttempts = 8;
                    rewardPoints = 200;
                    rewardLives = 0;
                } else if (choice == 2) {
                    upperBound = 500;
                    maxAttempts = 10;
                    rewardPoints = 200;
                    rewardLives = 1;
                } else {
                    upperBound = 1000;
                    maxAttempts = 10;
                    rewardPoints = 500;
                    rewardLives = 3;
                }
                int secret = RandomNumberGenerator.getGenerator().generate(upperBound);
                boolean guessed = false;
                for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                    System.out.println("(" + attempt + "/" + maxAttempts + ") Enter your guess:");
                    int guess = InputReader.readInt();
                    if (guess == secret) {
                        System.out.println("Congrats! You guessed the correct number.");
                        points += rewardPoints;
                        lives += rewardLives;
                        guessed = true;
                        break;
                    } else {
                        if (attempt < maxAttempts) {
                            if (guess < secret) {
                                System.out.println("The number is higher.");
                            } else {
                                System.out.println("The number is lower.");
                            }
                        }
                        if (!guessed) {
                            System.out.println("Sorry, you've used all attempts. The correct number was " + secret + ".");
                            lives--;

                            if (lives <= 0) {
                                System.out.println("Game over! You are out of lives.");
                                System.out.println("You are leaving with " + points + " points!");
                                return;
                            }
                        }
                        System.out.println("Game over! You are out of lives.");
                        System.out.println("You are leaving with " + points + " points!");
                    }
                }
            }
        }}

    // <==================================== HELPER METHODS ====================================>

    private void printMenu() {
        System.out.println("Choose difficulty level to start a new game:\n" +
                "(1) Easy   [0;100)   8 Attempts, Reward: +200 Points\n" +
                "(2) Medium [0;500)  10 Attempts, Reward: +200 Points +1 Life\n" +
                "(3) Hard   [0;1000) 10 Attempts, Reward: +500 Points +3 Lives\n" +
                "(4) Exit");
    }

    public static void main(String[] args) {
        new GuessTheNumber().guessTheNumber();
    }

}
