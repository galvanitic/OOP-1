import com.mixco.p1.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReverseString p1 = new ReverseString();
        Scanner p1Input = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String strToReverse = p1Input.nextLine();
        System.out.println(p1.reverse(strToReverse));
        System.out.println(" ");
    }
}