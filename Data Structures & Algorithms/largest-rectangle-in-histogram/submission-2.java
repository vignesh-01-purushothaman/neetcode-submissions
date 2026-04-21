class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int left = i;
            int right = i;

            while (left > 0 && heights[left - 1] >= height) {
                left--;
            }

            while (right < n - 1 && heights[right + 1] >= height) {
                right++;
            }

            int width = right - left + 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}

