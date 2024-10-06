class Solution {
    public boolean isValid(String s) {
        Stack<Character> list=new Stack<>();
        for(char a:s.toCharArray()){
            if(a=='{') list.push('}');
            else if(a=='[') list.push(']');
            else if(a=='(') list.push(')');
            else if(list.isEmpty() || list.pop()!=a) return false;
        }
        return list.isEmpty();
    }
}