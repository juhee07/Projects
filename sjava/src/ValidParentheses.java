import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        HashMap<Character, Character> mapping = new HashMap();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if(mapping.containsKey(c)) {
               Character popped = (stack.empty()) ? '#' : stack.pop();
               if(!popped.equals( mapping.get(c))) {
                   return false;
               }

            }
            else {
                stack.push(c);
            }

        }
        return stack.empty();

    }
}
