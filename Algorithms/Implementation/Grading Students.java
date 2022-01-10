import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;



public class Solution {
    
    static int[] solve(int[] grades){
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                int nextMultipleOfFive = 5 - (grades[i] % 5) + grades[i];
                if (nextMultipleOfFive - grades[i] < 3) {
                    grades[i] = nextMultipleOfFive;
                }
            }
        }
        
        return grades;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] grades = new int[number];
        
        for(int i = 0; i < number; i++){
            grades[i] = scan.nextInt();
        }
        
        int[] result = solve(grades);
        
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        
        System.out.println("");
    }
}
