class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(List.of(1));
        for(int i=1;i<numRows;i++){
            List<Integer> arr=new ArrayList<>();
            arr.add(1);
            int res=1;
            for(int j=0;j<i;j++){
                res*=(i-j);
                res/=j+1;
                arr.add(res);
            }
            list.add(arr);
        }
        return list;
    }
}