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
        int[][] ar = new int[6][6];
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                ar[i][j] = scan.nextInt();
            }
        }
        
        scan.close();
        
        int maxSum = -9*6;
        int sum = -9*6;
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                sum=ar[i][j]+ar[i][j+1]+ar[i][j+2]+ar[i+1][j+1]+ar[i+2][j]+ar[i+2][j+1]+ar[i+2][j+2];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
            
            
        }
        
        System.out.print(maxSum);
    }
    
    
}
