import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int ALength = A.length();
        int BLength = B.length();
        
        int sum = ALength + BLength;
        System.out.println(sum);
        
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String Aname = A.substring(0, 1).toUpperCase();
        String Acapitalized = Aname + A.substring(1);
        
        String Bname = B.substring(0, 1).toUpperCase();
        String Bcapitalized = Bname + B.substring(1);
        
        System.out.println(Acapitalized + " " + Bcapitalized);
    }
}



