class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char a:s.toCharArray()){
            if(stack.isEmpty()) stack.push(a);
            else if(a==')' && stack.peek()=='(') stack.pop();
            else stack.push(a);
        }
        return stack.size();
    }
}