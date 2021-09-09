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
    
    public static int bubbleSort(int[] a, int n){
        int numSwaps = 0;
        
        for(int i = 0; i < n; i++){
            int numberOfSwaps = 0;
            
            for (int j = 0; j < n - 1; j++){
                if (a[j] > a[j + 1]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    
                    numberOfSwaps++;
                    numSwaps++;
                }
            }
            
            if(numberOfSwaps == 0){
                    break;
            }
        }
        
        return numSwaps;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        int[] array = new int[number];
        
        for(int i=0; i < number; i++){
            array[i] = scan.nextInt();
        }
        
        scan.close();
        
        int numSwaps = bubbleSort(array, number);
        
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[number-1]);
    }
}
