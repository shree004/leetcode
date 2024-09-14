class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int el1=Integer.MIN_VALUE,el2=-1111111111,c1=0,c2=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(c1==0 && nums[i]!=el2){
                c1++;
                el1=nums[i];
            }
            else if(c2==0 && nums[i]!=el1){
                c2++;
                el2=nums[i];
            }
            else if(el1==nums[i]) c1++;
            else if(el2==nums[i]) c2++;
            else{
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1) c1++;
            if(nums[i]==el2) c2++;
        }
        if(c1>nums.length/3) list.add(el1);
        if(c2>nums.length/3) list.add(el2);
        return list;
    }
}