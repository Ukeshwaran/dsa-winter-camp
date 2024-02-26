package prefix_sum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxScore {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int Max=-1;
        for(int i=0;i<n;i++){
            if(i==0){ 
                a[i]=sc.nextInt();
                Max=a[i];
                }
                
            else {
                a[i]=a[i-1]+sc.nextInt();
                Max=Math.max(Max, a[i]);
        }
    }
    System.out.println(Max);
    }
}
