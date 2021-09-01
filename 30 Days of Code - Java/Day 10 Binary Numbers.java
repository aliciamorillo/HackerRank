import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        scan.close();
        
        char[] binary = Integer.toBinaryString(in).toCharArray();
        int temporalCount = 0;
        int maxCount = 0;
        
        for(int i = 0; i < binary.length; i++){
            temporalCount = (binary[i] == '0') ? 0 : temporalCount + 1; 
            if(temporalCount > maxCount){
                maxCount = temporalCount;
            }
        }
        
        System.out.println(maxCount);
    }
}
