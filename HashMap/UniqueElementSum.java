package HashMap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UniqueElementSum {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            h.put(a,h.getOrDefault(a, 0)+1);       
        }
        for(Integer x : h.keySet()){
            if(h.get(x)==1){
                sum+=x;
                
            }
        }
        System.out.println(sum);
    }
}
