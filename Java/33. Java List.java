import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int number = scan.nextInt();
         
         List<Integer> list=new ArrayList<Integer>();
         
         for(int i=0; i<number; i++){
             list.add(scan.nextInt());
         }
         
         number = scan.nextInt();
         
         for(int i=0; i<number; i++){
            String text = scan.next();
            
            if(text.compareTo("Insert")==0){
                list.add(scan.nextInt(),scan.nextInt());
            } else {
                list.remove(scan.nextInt());
            }
         }
         
         for(int i:list){
            System.out.print(i+ " ");             
         }
    }
}
