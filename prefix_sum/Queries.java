package prefix_sum;

import java.util.*;
public class Queries
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[] a={1,6,3,2,7,2};
		int n=sc.nextInt();
		int[][] q= new int[n][2];
		int[] p = new int[a.length]; 
		for(int i=0;i<n;i++){
		    q[i][0]=sc.nextInt();
		    q[i][1]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
		    if(i==0) p[i]=a[i];
		    else p[i]=p[i-1]+a[i];
		}
		int limit=13;
		int x,y;
		for(int i=0;i<q.length;i++){
		    int sum=0;
		    x=q[i][0];
		    y=q[i][1];
		  //  for(int j=x;j<=y;j++){
		  //      sum+=a[j];
		  //  }
		  if(x!=0) sum=p[y]-p[x-1];
		  else sum=p[y];
		    System.out.println(sum);
		}
	}
}
