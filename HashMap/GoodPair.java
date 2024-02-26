package HashMap;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GoodPair {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> h=new HashMap<>();
        int r=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            h.put(a,h.getOrDefault(a, 0)+1);       
        }
        for(Integer x : h.values()){
            if(x>1){
                r+=x*(x-1)/2;
            }
        }
        System.out.println(r);
    }
}