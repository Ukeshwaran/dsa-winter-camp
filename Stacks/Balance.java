package Stacks;
import java.util.HashMap;
import java.util.Stack;

class Hello{
    public static void main(String[] args) {
        String str = "{[())]}";
        char[] ch=str.toCharArray();
        System.out.println(balancepara(ch));
    }
    public static boolean balancepara(char[] ch){
        HashMap<Character,Character> m = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        m.put('{', '}');
        m.put('(', ')');
        m.put('[', ']');
        for(char x : ch){
            if(m.containsKey(x)){
                stack.push(x);
            }
            else{
                if(stack.empty())
                    return false;
                else{
                    if(!(m.get(stack.pop())==x))
                        return false;
                    }
            }
        }
        if(stack.empty())  
            return true;
        else  
            return false;
    }
}