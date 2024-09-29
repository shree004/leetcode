class Solution {
    public char kthCharacter(int k) {
        String str="a";
        while(str.length()<k){
            for(char c:str.toCharArray())
                str+=(char)((((c-'a')+1)%26)+97);
        }
        return str.charAt(k-1);
    }
}