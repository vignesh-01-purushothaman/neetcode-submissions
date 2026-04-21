class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int area = 0;
        int Maxarea = 0;
        int j = heights.length-1;
        while(i<j){
            area = Math.min(heights[i],heights[j])*(j-i);
            if(heights[i]>heights[j]){
                j--;
            }
            else{
                i++;
            }
            if(area>=Maxarea){
                Maxarea=area;
            }
        }


        return Maxarea;


        
    }
}
