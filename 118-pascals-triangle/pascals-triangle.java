class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(List.of(1));
        for(int i=1;i<numRows;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            ArrayList<Integer> row=new ArrayList<>();
            arr.add(0);
            arr.addAll(list.get(list.size()-1));
            arr.add(0);
            for(int j=0;j<=i;j++){
                row.add(arr.get(j)+arr.get(j+1));
            }
            list.add(row);
        }
        return list;
    }
}