/*Given an integer,n , perform the following conditional actions:

-If n is odd, print Weird
-If n is even and in the inclusive range of 2 to 5, print Not Weird
-If n is even and in the inclusive range of 6 to 20, print Weird
-If n is even and greater than 20, print Not Weird

Sample Input 0
3
Sample Output 0
Weird

Sample Input 1
24
Sample Output 1
Not Weird
  */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            if( n >= 2 && n <= 5){
                System.out.println("Not Weird");
            }
            else if(n >= 6 && n <= 20){
                System.out.println("Weird");
            }
            else if(n > 20){
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }
        sc.close();
    }
}
