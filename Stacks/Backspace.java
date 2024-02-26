package Stacks;
//ip s=ab#c,t=ad#c 
//op ac===c true
public class Backspace {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(buildStack(s).equals(buildStack(t)));
    }
    public static String  buildStack(String s){
        char[] ch=s.toCharArray();
        StringBuilder stack = new StringBuilder();
        for(char x : ch){
            if(x=='#' && stack.length()!=0)
                stack.deleteCharAt(stack.length()-1);
            else
                stack.append(x);
        }
        return stack.toString();
    }
}
