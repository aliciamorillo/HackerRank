import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String input = "";
        int count = 1;
        
        while (scan.hasNext()) {  
            input = scan.nextLine();
            System.out.println(count + " " + input);
            count++;
        }
        
    }
}
