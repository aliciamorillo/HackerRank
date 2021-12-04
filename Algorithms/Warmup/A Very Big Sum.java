import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        long sum = 0;
        
        while(number-- > 0){
            sum += scan.nextInt();
        }
        
        System.out.println(sum);
    }
}
