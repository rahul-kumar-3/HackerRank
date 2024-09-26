/*Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98*/
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = 0;
            int k = 0;
            for(int j = 0; j < n; j++){
                 s = s+(int) (Math.pow(2,j) * b);
                 k = a + s;
                System.out.print(k+" "); 
            }
            System.out.println(" ");
        }
        in.close();
    }
}
