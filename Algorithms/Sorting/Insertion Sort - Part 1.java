import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;



public class Solution {
    
    public static void insertIntoSorted(int[] array){
        int temp = array[array.length - 1];
        
        for(int i = array.length - 2; i >= 0; i--){
            if(temp >= array[i]){
                array[i+1] = temp;
                printArray(array);
                break;
            }
            
            array[i+1] = array[i];
            printArray(array);
        }
        
        if(temp < array[0]){
            array[0] = temp;
            printArray(array);
        }
    }
    
    private static void printArray(int[] array){
        for(int number: array){
            System.out.print(number + " ");
        }
        
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];
        
        for(int i = 0; i < num; i++){
            array[i] = scan.nextInt();
        }
        
        insertIntoSorted(array);
    }
}
