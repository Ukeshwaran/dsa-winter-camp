//additional undo operation for one character
//ip s=ab#^c    t=abb#c
//op abc==abc ->true
package Stacks;

public class Backspaceundo {
    public static void main(String[] args) {
        String s = "ab#^c";
        String t = "abb#c";
        System.out.println(buildStack(s).equals(buildStack(t)));
    }
    public static String  buildStack(String s){
        char[] ch=s.toCharArray();
        StringBuilder stack = new StringBuilder();
        char del=' ';
        for(char x : ch){
            if(x=='#' && stack.length()!=0){
                del=stack.charAt(stack.length()-1);
                stack.deleteCharAt(stack.length()-1);
            }
            else if(x=='^' && stack.length()!=0)
                stack.append(del);
            else 
                stack.append(x);
        }
        return stack.toString();
    }
}
