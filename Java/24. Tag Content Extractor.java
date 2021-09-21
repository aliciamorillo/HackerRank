import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
        
        Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
        Scanner scan = new Scanner(System.in);
        
        int cases = Integer.parseInt(scan.nextLine());
        
        while(cases-- > 0){
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);
            
            boolean invalid = true;
            
            while(matcher.find()){
                System.out.println(matcher.group(2));
                invalid = false;
            }
            
            if(invalid){
                System.out.println("None");
            }
        }
	}
}
