class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        String str="";
        for(char c: s.toCharArray()){
            if(c=='('){
                if(stack.size()>0){
                    str+=c;
                }
                stack.push(c);
            } 
            
            else{
                stack.pop();
                if(stack.size()>0){
                    str+=c;
                }
            }
        }
        return str;
    }
}