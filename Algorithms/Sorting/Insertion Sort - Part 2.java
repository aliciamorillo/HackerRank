import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


public class Solution {
    
    public static void insertIntoSorted2(int[] array){
        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0; j--){
                if(array[j-1] <= array[j]){
                    printArray(array);
                    break;
                } else {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    if(j-1 == 0) printArray(array);
                }
            }
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
        
        insertIntoSorted2(array);
    }
}
