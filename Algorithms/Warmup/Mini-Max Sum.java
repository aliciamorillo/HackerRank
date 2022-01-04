import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long min = Long.MAX_VALUE;
        long max = 0;
        long sum = 0;
        
        for(int i=0; i<5; i++){
            long current = scan.nextLong();
            
            if(max < current){
                max = current;
            }
            
            if(min > current){
                min = current;
            }
            
            sum += current;
        }
        
        long minSum = sum - max;
        
        long maxSum = sum - min;
        
        System.out.println(minSum + " " + maxSum);
        
    }
}
