package thi;

import java.util.ArrayList;

public class Solution3 {
    private ArrayList<Integer> list;
    public Solution3(){
        list = new ArrayList<>();
    }

    public void push(int x){
        list.add(x);
    }
    public int pop(){
        if (list.isEmpty()){
            return -1;
        }
        return list.remove(list.size() - 1);
    }
    public int peek() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
    }
    public static void main(String[] args) {
    Solution3 stack = new Solution3();
    
    stack.push(10);
    stack.push(20);
    stack.push(30);
    
    System.out.println(stack.peek());   // 30
    System.out.println(stack.pop());    // 30
    System.out.println(stack.pop());    // 20
    System.out.println(stack.pop());    // 10
    System.out.println(stack.pop());    // -1
}
}
