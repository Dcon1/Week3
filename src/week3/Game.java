package week3;
import java.util.Random;
import java.util.Scanner;

public class Game {
    //    Secret will generate a random number from 1 to 10
    private Random random = new Random();
    int secret = random.nextInt(10) + 1;

    int wins;
    int count;

    public makeGuess(int value){
        if (value == secret) {
            count = count +1;
            wins = wins +1;
            System.out.println("Yaaaay you won");
        } else {
            count = count +1;
            System.out.println("You lose try again");
        }
    }
}
