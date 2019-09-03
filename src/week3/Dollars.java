package week3;

import java.util.Scanner;

public class Dollars {
    public static void dollars(){
        Scanner input = new Scanner(System.in);
        Double totalDollars = input.nextDouble();
        Double twenties = totalDollars / 20;
        Double leftOver = totalDollars % 20;
        Double tens = leftOver / 10;
        leftOver = leftOver % 10;
        Double fives = leftOver / 5;
        leftOver = leftOver % 5;
        Double ones = leftOver / 1;
        leftOver = leftOver % 1;
        System.out.println("You have - " +
                twenties + " x twenties. " +
                tens + " x tens. " +
                fives + " x fives. " +
                ones + " x ones. ");
    }
}
