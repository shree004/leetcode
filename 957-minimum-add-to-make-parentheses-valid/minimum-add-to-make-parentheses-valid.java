class Solution {
    public int minAddToMakeValid(String s) {
        int open=0,closed=0;
        for(char a:s.toCharArray()){
            if(a=='('){
                open++;
            }
            else{
                if(open>0)open--;
                else closed++;
            }
        }
        return open+closed;
    }
}