package week3;
import java.util.Random;
import java.util.Scanner;

public class Game {
    //    Secret will generate a random number from 1 to 10
    private Random random = new Random();
    int secret = random.nextInt(10) + 1;

    int wins;
    int count;

    void makeGuess(int value){
        System.out.println("Please make a guess 1 - 10");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        if (guess == secret) {
            count = count +1;
            wins = wins +1;
            System.out.println("Yaaaay you won");
        } else {
            count = count +1;
            System.out.println("You lose try again");
        }
    }
}
