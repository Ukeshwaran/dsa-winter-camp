package Stacks;

/**
 * Duplicates
 */
public class Duplicates {

    public static void main(String[] args) {
        String str ="abbaca";
        StringBuilder stack=new StringBuilder();
        for(char x : str.toCharArray()){
                if(stack.length()>0 && stack.charAt(stack.length()-1)==x )
                    stack.deleteCharAt(stack.length()-1);
                else
                    stack.append(x);
        }
        System.out.println(stack);
    }
}
