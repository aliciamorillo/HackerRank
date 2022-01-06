import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


public class Solution {
    static final String SPECIAL_CHARACTERS = "!@#$%^&*()-+";
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        scan.nextInt();
        String password = scan.next();
        System.out.println(solve(password));

        scan.close();
    }
    
    static int solve(String password){
        int addNumber = 0;
        
        if (!password.chars().anyMatch(Character::isDigit)) {
            addNumber++;
        }
        
        if (!password.chars().anyMatch(Character::isLowerCase)) {
            addNumber++;
        }
        
        if (!password.chars().anyMatch(Character::isUpperCase)) {
            addNumber++;
        }
        
        if (!password.chars().anyMatch(ch -> SPECIAL_CHARACTERS.indexOf((char) ch) >= 0)) {
            addNumber++;
        }
        
        addNumber = Math.max(addNumber, 6 - password.length());

        return addNumber;
    }
}
