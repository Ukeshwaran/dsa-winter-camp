package Stacks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GoodString {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        char[] ch=s.toCharArray();
        StringBuilder stack =new StringBuilder();
        for(int x : ch){
            if(stack.length()!=0){
                int curr=stack.charAt(stack.length()-1);
                if(97<=x && x<=122 && 60<=curr && curr<=90 && 122-x==90-curr){
                    stack.deleteCharAt(stack.length()-1);
                }
                else if(60<=x && x<=90 && 97<=curr && curr<=122 && 90-x==122-curr){
                     stack.deleteCharAt(stack.length()-1);
                }
                else{
                    stack.append((char)x);
                }
            }
            else{
                stack.append((char)x);
            }
        }
        System.out.println(stack.toString());
    }
}
