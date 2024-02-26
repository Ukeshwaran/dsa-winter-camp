package HashSet;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OccursOnlyOnce {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        int Max=0;
        for(int i=0;i<n;i++){   
            int l=i,r=b.length-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(a[i]>b[mid]){
                    r=mid-1;
                }
                else if(a[i]<b[mid]){
                    Max = Math.max(Max, (b.length-1)-i);
                    break;
                }
            }  
        }
        System.out.println(Max);
    }
}