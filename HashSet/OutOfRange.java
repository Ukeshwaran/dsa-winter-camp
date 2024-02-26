package HashSet;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OutOfRange {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        //HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            hs.add(sc.nextInt());
        }
        for(int i=0;i<=n;i++){
            if(!hs.contains(i)){
                System.out.println(i);
                break;
            }
        }
    }
}