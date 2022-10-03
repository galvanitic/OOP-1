import com.mixco.p1.*;
import com.mixco.p2.*;
import com.mixco.p3.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReverseString p1 = new ReverseString();
        System.out.println("Problem #1: Write a Java method that will take a string and reverse it. Can you come up with a method that is faster than regular reversing of the for loop?");
        System.out.println("---");
        System.out.print("In: Hello World => Out: ");
        System.out.print(p1.reverse("Hello World"));
        System.out.println(" ");
        System.out.print("In: desencuentro => Out: ");
        System.out.print(p1.reverse("desencuentro"));
        System.out.println(" ");
        System.out.print("In: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa => Out: ");
        System.out.print(p1.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        System.out.println(" ");
        System.out.println(" ");

        ObfuscateString p2 = new ObfuscateString();
        System.out.println("Problem #2: Write a Java program that generates a new string by concatenating the reversed substrings of even indexes and odd indexes separately from a given string. For this code you may use the above method to reverse the string.");
        System.out.println("---");
        System.out.print("In: abscacd => Out: ");
        System.out.print(p2.obfuscate("abscacd"));
        System.out.println(" ");
        System.out.print("In: desencuentro => Out: ");
        System.out.print(p2.obfuscate("desencuentro"));
        System.out.println(" ");
        System.out.print("In: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa => Out: ");
        System.out.print(p2.obfuscate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        System.out.println(" ");
        System.out.println(" ");

        FindX p3 = new FindX();
        System.out.println("Problem #3: In a bag there are N distinct coins. Each coin has a value between 1 and N. However, there is one coin that is marked X. How will you find the value of X in an efficient way?");
        System.out.println("---");
        System.out.print("In: {5,3,1,4,-1,6} => Out: ");
        int[] input1 = new int[]{5,3,1,4,-1,6};
        System.out.print(p3.find(input1));
        System.out.println(" ");
        System.out.print("In: {2,5,-1,4,3,6,8,7} => Out: ");
        int[] input2 = new int[]{2,5,-1,4,3,6,8,7};
        System.out.print(p3.find(input2));
        System.out.println(" ");
        System.out.print("In: {2,5,1,4,3,6,8,7} => Out: ");
        int[] input3 = new int[]{2,5,1,4,3,6,8,7};
        System.out.print(p3.find(input3));
        System.out.println(" ");
        System.out.println(" ");
    }
}