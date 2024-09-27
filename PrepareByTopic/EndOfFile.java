import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str;
       int i = 1;
       while(sc.hasNext()){
           str = sc.nextLine();
           System.out.println(i+" "+str);
           i++;
       }
       sc.close();
    }
}
