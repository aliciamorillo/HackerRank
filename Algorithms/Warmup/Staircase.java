import java.io.*;
import java.util.*;


public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        
        for(int i=0; i<number; i++){
            for(int j=1; j<=number; j++){
                System.out.print(i<number-j?" ":"#");
            }
            
            System.out.println("");
        }
        
    }
}