import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int intNumber = Integer.valueOf(scan.nextLine());
        double doubleNumber = Double.valueOf(scan.nextLine());
        String stringPractice = scan.nextLine();
        

        System.out.println(i + intNumber);

		System.out.println(d + doubleNumber);

        System.out.println(s + stringPractice);
        
        scan.close();
    }
}