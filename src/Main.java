import com.mixco.p1.*;
import com.mixco.p2.*;
import com.mixco.p3.*;
import com.mixco.p4.*;
import com.mixco.p5.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ReverseString p1 = new ReverseString();
        long start1 = System.currentTimeMillis();
        System.out.println("Problem #1: Write a Java method that will take a string and reverse it. Can you come up with a method that is faster than regular reversing of the for loop?");
        System.out.println("---");
        System.out.print("In: Hello World => Out: ");
        System.out.print(p1.reverse("Hello World"));
        long stop1 = System.currentTimeMillis();
        float delta1 = (stop1-start1)/1000F;
        System.out.println(" Completed in: "+delta1+" seconds.");
        System.out.println(" ");
        long start2 = System.currentTimeMillis();
        System.out.print("In: desencuentro => Out: ");
        System.out.print(p1.reverse("desencuentro"));
        long stop2 = System.currentTimeMillis();
        float delta2 = (stop2-start2)/1000F;
        System.out.println(" Completed in: "+delta2+" seconds.");
        System.out.println(" ");
        long start3 = System.currentTimeMillis();
        System.out.print("In: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa => Out: ");
        System.out.print(p1.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        long stop3 = System.currentTimeMillis();
        float delta3 = (stop3-start3)/1000F;
        System.out.println(" Completed in: "+delta3+" seconds.");
        System.out.println(" ");
        System.out.println(" ");

        ObfuscateString p2 = new ObfuscateString();
        long start4 = System.currentTimeMillis();
        System.out.println("Problem #2: Write a Java program that generates a new string by concatenating the reversed substrings of even indexes and odd indexes separately from a given string. For this code you may use the above method to reverse the string.");
        System.out.println("---");
        System.out.print("In: abscacd => Out: ");
        System.out.print(p2.obfuscate("abscacd"));
        long stop4 = System.currentTimeMillis();
        float delta4 = (stop4-start4)/1000F;
        System.out.println(" Completed in: "+delta4+" seconds.");
        System.out.println(" ");
        long start5 = System.currentTimeMillis();
        System.out.print("In: desencuentro => Out: ");
        System.out.print(p2.obfuscate("desencuentro"));
        long stop5 = System.currentTimeMillis();
        float delta5 = (stop5-start5)/1000F;
        System.out.println(" Completed in: "+delta5+" seconds.");
        System.out.println(" ");
        long start6 = System.currentTimeMillis();
        System.out.print("In: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa => Out: ");
        System.out.print(p2.obfuscate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        long stop6 = System.currentTimeMillis();
        float delta6 = (stop6-start6)/1000F;
        System.out.println(" Completed in: "+delta6+" seconds.");
        System.out.println(" ");
        System.out.println(" ");

        FindX p3 = new FindX();
        System.out.println("Problem #3: In a bag there are N distinct coins. Each coin has a value between 1 and N. However, there is one coin that is marked X. How will you find the value of X in an efficient way?");
        System.out.println("---");
        long start7 = System.currentTimeMillis();
        System.out.print("In: [5,3,1,4,-1,6] => Out: ");
        int[] input1 = new int[]{5,3,1,4,-1,6};
        System.out.print(p3.find(input1));
        long stop7 = System.currentTimeMillis();
        float delta7 = (stop7-start7)/1000F;
        System.out.println(" Completed in: "+delta7+" seconds.");
        System.out.println(" ");
        long start8 = System.currentTimeMillis();
        System.out.print("In: [2,5,-1,4,3,6,8,7] => Out: ");
        int[] input2 = new int[]{2,5,-1,4,3,6,8,7};
        System.out.print(p3.find(input2));
        long stop8 = System.currentTimeMillis();
        float delta8 = (stop8-start8)/1000F;
        System.out.println(" Completed in: "+delta8+" seconds.");
        System.out.println(" ");
        long start9 = System.currentTimeMillis();
        System.out.print("In: [2,5,1,4,3,6,8,7] => Out: ");
        int[] input3 = new int[]{2,5,1,4,3,6,8,7};
        System.out.print(p3.find(input3));
        long stop9 = System.currentTimeMillis();
        float delta9 = (stop9-start9)/1000F;
        System.out.println(" Completed in: "+delta9+" seconds.");
        System.out.println(" ");
        System.out.println(" ");

        DNA p4 = new DNA();
        System.out.println("Problem #4: Generate two random arrays of size n > 100 from a set S= {‘A’, ‘C’, ‘T’, ’G’}. Return the first index if you can find only 4 consecutive 'G's in both the arrays at the same indexes. Experiment with different values of n.");
        System.out.println("---");
        long start10 = System.currentTimeMillis();
        System.out.println("DNA Length: 101");
        char[] DNA1 = p4.generateRandDNA(101);
        char[] DNA2 = p4.generateRandDNA(101);
        System.out.println("DNA 1: "+ Arrays.toString(DNA1));
        System.out.println("DNA 2: "+ Arrays.toString(DNA2));
        int index1 = p4.indexOf4ConsecutiveGuanine(DNA1,DNA2);
        System.out.println(index1 == -1 ? " " : "4 Consecutive Guanine Bases found starting on index: "+index1);
        long stop10 = System.currentTimeMillis();
        float delta10 = (stop10-start10)/1000F;
        System.out.println(" Completed in: "+delta10+" seconds.");
        System.out.println(" ");
        long start11 = System.currentTimeMillis();
        System.out.println("DNA Length: 20000");
        char[] DNA3 = p4.generateRandDNA(20000);
        char[] DNA4 = p4.generateRandDNA(20000);
        System.out.println("DNA 3: "+ Arrays.toString(DNA3));
        System.out.println("DNA 4: "+ Arrays.toString(DNA4));
        int index2 = p4.indexOf4ConsecutiveGuanine(DNA3,DNA4);
        System.out.println(index2 == -1 ? " " : "4 Consecutive Guanine Bases found starting on index: "+index2);
        long stop11 = System.currentTimeMillis();
        float delta11 = (stop11-start11)/1000F;
        System.out.println(" Completed in: "+delta11+" seconds.");
        System.out.println(" ");
        long start12 = System.currentTimeMillis();
        System.out.println("DNA Length: 101 and 2000");
        System.out.println("DNA 5: "+ Arrays.toString(DNA1));
        System.out.println("DNA 6: "+ Arrays.toString(DNA4));
        int index3 = p4.indexOf4ConsecutiveGuanine(DNA1,DNA4);
        System.out.println(index3 == -1 ? " " : "4 Consecutive Guanine Bases found starting on index: "+index3);
        long stop12 = System.currentTimeMillis();
        float delta12 = (stop12-start12)/1000F;
        System.out.println(" Completed in: "+delta12+" seconds.");
        System.out.println(" ");
        System.out.println(" ");

        ShiftArray p5 = new ShiftArray();
        System.out.println("Problem #5: Write a Java method that will take an array of integers of size n and shift right by m places, where n > m. You can read your inputs from a file and write your outputs to another file.");
        System.out.println("---");
        long start13 = System.currentTimeMillis();
        System.out.print("In: [-6, -7, 2, 4, 16, 1] => Out: ");
        int[] arr1 = new int[]{-6, -7, 2, 4, 16, 1};
        int[] shArr1 = p5.shift(arr1, 2);
        System.out.print(Arrays.toString(shArr1));
        long stop13 = System.currentTimeMillis();
        float delta13 = (stop13-start13)/1000F;
        System.out.println(" Completed in: "+delta13+" seconds.");
        System.out.println(" ");
        long start14 = System.currentTimeMillis();
        System.out.print("In: [2, 3, 4, 5, 7, 11, 13, 17] => Out: ");
        int[] arr2 = new int[]{2, 3, 4, 5, 7, 11, 13, 17};
        int[] shArr2 = p5.shift(arr2, 4);
        System.out.print(Arrays.toString(shArr2));
        long stop14 = System.currentTimeMillis();
        float delta14 = (stop14-start14)/1000F;
        System.out.println(" Completed in: "+delta14+" seconds.");
        System.out.println(" ");
        long start15 = System.currentTimeMillis();
        System.out.print("In: [0, -1, -2,-8, 6] => Out: ");
        int[] arr3 = new int[]{0, -1, -2,-8, 6};
        int[] shArr3 = p5.shift(arr3, -1);
        System.out.print(Arrays.toString(shArr3));
        long stop15 = System.currentTimeMillis();
        float delta15 = (stop15-start15)/1000F;
        System.out.println(" Completed in: "+delta15+" seconds.");
        System.out.println(" ");
        System.out.println(" ");
    }
}