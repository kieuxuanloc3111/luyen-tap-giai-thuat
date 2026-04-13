package thi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class KiemTraNgoac {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c== '(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((c==')' && top != '(') || (c=='}' && top != '{') || (c==']' && top != '[')){
                    return false;
                }
            }
            
            
        }
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('(', '{', '['));
    
        return stack.isEmpty();
    }
}
