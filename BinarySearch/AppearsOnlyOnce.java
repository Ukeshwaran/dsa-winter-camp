package BinarySearch;

import java.util.*;
public class AppearsOnlyOnce {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> stack = new Stack<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(stack.size()!=0){
                    
                    if(stack.size()!=0 && Math.abs(a)==Math.abs(stack.peek()))
                        stack.pop();
                        
                    if(a>0 && stack.peek()>0)
                        stack.add(a);
                        
                    else if(a<0 && stack.peek()<0)
                        stack.add(a);

                    else{
                        int x=Math.abs(a);
                        int y=Math.abs(stack.peek());
                        if(x>y){
                            stack.pop();
                            stack.add(a);
                        }
                    }
                }
                else 
                    stack.add(a);
            }
        for(Integer x:stack) 
            System.out.print(x+" ");
    }
}