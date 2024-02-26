package prefix_sum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Garden {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int c=n;
        int[] a=new int[n];
        // boolean flag=false;
        for(int i=0;i<n;i++){
            if(i==0){ 
                a[i]=sc.nextInt();
                } 
            else {
                a[i]=a[i-1]+sc.nextInt();
            }
        }
        
            for(int i=0;i<n;i++){
                if(c>1){
                if(i==0){
                    if(a[i]==a[n-1]-a[n-2]){
                    System.out.println(a[n-1]);
                    break;}
                }
                else if(a[i]-a[i-1]==a[n-1]-a[n-2]){
                    System.out.println(a[n-1]-a[i-1]);
                    break;
                }
                c--;
            }
            }
    }
}

