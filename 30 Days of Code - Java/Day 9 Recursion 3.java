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

class Result {

    public static int factorial(int n) {
        if(n > 1) { 
            return n * factorial(n - 1);
        } else { 
            return 1;
        }
    }
}

public class Solution extends Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        scan.close();
        System.out.println(factorial(in));
    }
}
