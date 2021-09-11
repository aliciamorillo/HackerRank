import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        
        for(int i=0; i<number; i++){
            int b = scan.nextInt();
            int f = 0;
            
            if(b < 2){
                System.out.println("Not prime");
                continue;
            }
            
            for(int y=2; y<=Math.sqrt(b); y++){
                if(b%y==0){
                    f++;
                    break;
                }
            }
            
            if(f==0){
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }

}
