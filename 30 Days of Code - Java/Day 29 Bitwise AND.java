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
        
        int inputNumber = scan.nextInt();
        
        for(int i=0; i < inputNumber; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println(solution(A,B));
        }
        
        scan.close();
    }
    
    static int solution(int A, int B){
        int result = 0;
        
        for(int j=1; j<=A; j++){
            for (int k=j + 1; k<=A; k++){
                int current = j & k;
                if(current > result && current < B){
                    result = current;
                }
            }
        }
        
        return result;
    }
}
