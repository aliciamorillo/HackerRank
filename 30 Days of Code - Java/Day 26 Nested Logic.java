import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int day1 = scan.nextInt();
        int month1 = scan.nextInt();
        int year1 = scan.nextInt();
        int day2 = scan.nextInt();
        int month2 = scan.nextInt();
        int year2 = scan.nextInt();
        
        int date = 0;
        
        if(year1 == year2 && month1 == month2 && day1 > day2){
            date = (day1-day2)*15;
        
        } else if(year1 == year2 && month1 > month2){
            date = 500*(month1-month2);
        
        } else if(year1 > year2){
            date = 10000;
        }
        
        System.out.println(date);
    }
}
