import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;



public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String testString = scan.next();
        System.out.println(superReduced(testString));
    }
    
    private static String superReduced(String s){
        if(s.length() < 1){
            return "Empty String";
        }
        
        if(s.length() == 1){
            return s;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(i < s.length()-1 && s.charAt(i+1) == s.charAt(i)){
                return superReduced(s.substring(0,i) + s.substring(i+2, s.length()));
            }
        }
        
        return s;
    }
}