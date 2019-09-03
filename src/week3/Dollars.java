package week3;

import java.util.Scanner;

public class Dollars {
    public static void dollars(){
        Scanner input = new Scanner(System.in);
        int totalDollars = input.nextInt();
        int twenties = totalDollars / 20;
        int leftOver = totalDollars % 20;
        int tens = leftOver / 10;
        leftOver = leftOver % 10;
        int fives = leftOver / 5;
        leftOver = leftOver % 5;
        int ones = leftOver / 1;
        leftOver = leftOver % 1;
        System.out.println("You have - " +
                twenties + " x twenties. " +
                tens + " x tens. " +
                fives + " x fives. " +
                ones + " x ones. ");
    }
}
