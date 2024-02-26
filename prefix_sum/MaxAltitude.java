package prefix_sum;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxAltitude {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] p=new int[n+1];
        p[0]=0;
        int al=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            p[i+1]=p[i]+a[i];
            al=Math.max(al, p[i+1]);
        }
        System.out.println(al);
    }
}