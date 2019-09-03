package week3;

import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class InchesToFeet {
    public static void inchesToFeet() {
        Scanner input = new Scanner(System.in); // Q2. - I already had made the script interactive
        Double number = input.nextDouble();
        Double inchesInFoot = 12.0;
        Double output = (number / inchesInFoot);
        System.out.println(output);
    }
}
