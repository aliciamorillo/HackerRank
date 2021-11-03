import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        scan.close();
        
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(string.getBytes());
            byte[] digest = md.digest();
            
            for(byte b: digest){
                System.out.format("%02x", b);
            }
        
        } catch(NoSuchAlgorithmException exception){
            System.out.println(exception);
        }
    }
}
