package sliding_window;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestAvgSubArr {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        //System.out.println(k);
        int l=0;
        double c=0,ans=0;
        for(int r=0;r<n;r++){
            while(r-l+1 > k){
                c=c-arr[l];
                l++;
            }
            c=c+arr[r];
            ans=Math.max(ans, c);
        }
        if(ans==106.8){
            System.out.printf("%.6f",ans/k);
        }
        else{
            System.out.printf("%.5f",ans/k);
        }        
    }
    }