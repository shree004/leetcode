class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area=0;
        int diagonal=0;
        for(int i=0;i<dimensions.length;i++){
            int a=dimensions[i][0];
            int b=dimensions[i][1];
            int d=a*a+b*b;
            if(diagonal<d || (diagonal==d && a*b>area)){
                diagonal=d;
                area=a*b;
            }
        }
        return area;
    }
}