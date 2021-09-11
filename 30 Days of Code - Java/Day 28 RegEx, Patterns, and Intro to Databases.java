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
        int number = scan.nextInt();
        String[] input = new String[number];
        
        int index = 0;
        
        Pattern p = Pattern.compile("[a-z]+@gmail.com");
        ArrayList<String> arr = new ArrayList();
        Matcher m;
        
        for(int a0 = 0; a0 < number; a0++){
            String firstName = scan.next();
            String email = scan.next();
            m = p.matcher(email);
            if(m.find()){
                arr.add(firstName.toLowerCase());
            }
        }
        
        Collections.sort(arr);
        
        for(String each: arr){
            System.out.println(each);
        }
    }
}
