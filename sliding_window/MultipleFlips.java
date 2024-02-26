package sliding_window;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MultipleFlips {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        //String str = sc.next();
        int l=0,c=0,ans=0;
        for(int r=0;r<n;r++){
            if(arr[r]==0){
                c++;
            }
            while(c>k){
                if(arr[l]==0){
                    c--;
                }
                l++;
            }
            ans=Math.max(ans, r-l+1);
        }
        System.out.println(ans);
    }
}