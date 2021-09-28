//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh){
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();
        
        for(int i=0; i<number; i++){
            String name = scan.nextLine();
            int phone = scan.nextInt();
            hashmap.put(name, phone);
            scan.nextLine();
        }
        
        while(scan.hasNext()){
            String s = scan.nextLine();
            if(hashmap.containsKey(s)){
                System.out.println(s + "=" + hashmap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
	}
}



