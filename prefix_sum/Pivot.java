package prefix_sum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pivot {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
                Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] p=new int[n];
        int flag=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(i==0) p[i]=a[i];
            else p[i]=p[i-1]+a[i];
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(p[n-1]-p[i]==0){
                    System.out.println("0");
                    flag=1;
                    break;
                }
            }
            else if(i==n-1){
                 if(p[i-1]==0){
                    System.out.println("0");
                    flag=1;
                    break;
                }
            }
            else{
                if(p[i-1]==p[n-1]-p[i]){ 
                    System.out.println(i);
                    flag=1;
                    break;
            }
        }
    }
    if(flag==0) System.out.println("-1");
    }
}