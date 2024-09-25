class Solution {
    public int max(int[][]mat,int y){
        int max=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<mat.length;i++){
            if(max<mat[i][y]) {
                max=mat[i][y];
                ind=i;
            }
        }
        return ind;
    }
    public int[] findPeakGrid(int[][] mat) {
        int low=0;
        int high=mat[0].length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=max(mat,mid);
            int left=mid-1>=0 ? mat[row][mid-1]:-1;
            int right=mid+1<mat[0].length ? mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right) return new int[]{row,mid};
            if(mat[row][mid]<left) high=mid-1;
            else low=mid+1;
        }
        return new int[]{-1,-1};
    }
}