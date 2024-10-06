class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] str1=sentence1.split(" ");
        String[] str2=sentence2.split(" ");
        if(str1.length>str2.length){
            String[] temp=str1;
            str1=str2;
            str2=temp;
        }
        int l1=0,l2=0;
        while(l1<str1.length && l2<str2.length && str1[l1].equals(str2[l2])){
            l1++;l2++;
        }
        int r1=str1.length-1,r2=str2.length-1;
        while(r1>=0 && r2>=0 && str1[r1].equals(str2[r2])){
            r1--;r2--;
        }
        return l1>r1;
    }
}