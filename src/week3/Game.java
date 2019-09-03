package week3;
import java.util.Random;

public class Game {
    //    Secret will generate a random number from 1 to 10
    private Random random = new Random();
    int secret = random.nextInt(10) + 1;

    int wins;
    int count;

    void makeGuess(int value){
        if (value == secret) {
            count = count +1;
            wins = wins +1;
        } else {
            count = count +1;
        }
    }
}
