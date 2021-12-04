import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int diagonal1 = 0;
        int diagonal2 = 0;
        
        for(int i=0; i<n; i++){
            String str[] = scan.nextLine().split(" ");
            diagonal1 += Integer.parseInt(str[i]);
            diagonal2 += Integer.parseInt(str[n-1-i]);
        }
        
        int diagonalDifference = Math.abs(diagonal1 - diagonal2);
        
        System.out.println(diagonalDifference);
    }
}
