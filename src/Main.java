import com.mixco.p1.*;
import com.mixco.p2.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReverseString p1 = new ReverseString();
        Scanner p1Input = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String strToReverse = p1Input.nextLine();
        System.out.println(p1.reverse(strToReverse));
        System.out.println(" ");

        ObfuscateString p2 = new ObfuscateString();
        Scanner p2Input = new Scanner(System.in);
        System.out.print("Enter a string to obfuscate: ");
        String strToObfuscate = p2Input.nextLine();
        System.out.println(p2.obfuscate(strToObfuscate));
        System.out.println(" ");
    }
}