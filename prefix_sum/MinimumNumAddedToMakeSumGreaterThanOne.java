package prefix_sum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumNumAddedToMakeSumGreaterThanOne {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] p=new int[n];
        int min=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(i==0){
                p[i]=a[i];
                min=a[i];
                }
            else{
                p[i]=p[i-1]+a[i];
                min=Math.min(min, p[i]);
        }
    }
    if(min>0) System.out.println(min);
    else System.out.println(Math.abs(min)+1);
}
}