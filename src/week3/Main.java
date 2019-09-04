package week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please make a guess 1 - 10");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        userGuess = new week3.Game.makeGuess(guess);
    }
}
