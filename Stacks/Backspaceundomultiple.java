package Stacks;

public class Backspaceundomultiple {
    public static void main(String[] args) {
        String s = "abc##^^d";
        String t = "ab#^cd";
        System.out.println(buildStack(s).equals(buildStack(t)));
    }
    public static String  buildStack(String s){
            char[] ch=s.toCharArray();
            StringBuilder stack = new StringBuilder();
            StringBuilder del = new StringBuilder();
            for(char x : ch){
                if(x=='#' && stack.length()!=0){
                    del.append(stack.charAt(stack.length()-1));
                    stack.deleteCharAt(stack.length()-1);
                }
                else if(x=='^' && del.length()!=0){
                    stack.append(del.charAt(del.length()-1));
                    del.deleteCharAt(del.length()-1);
                }
                else 
                    stack.append(x);
            }
            return stack.toString();
        }  
}
