

public class Solution {
    LinkedList<Character> stack = new LinkedList();
    LinkedList<Character> queue = new LinkedList();
    
    public void pushCharacter(char ch){
        stack.push(ch);
    }
    
    public void enqueueCharacter(char ch){
        queue.add(ch);
    }
    
    public char popCharacter(){
        return stack.pop();
    }
    
    public char dequeueCharacter(){
        return queue.remove();
    }

