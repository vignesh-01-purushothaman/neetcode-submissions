class Solution {
    public int trap(int[] height) {
        int area = 0;
        
        for (int i = 0; i < height.length; i++) {
            if (height[i] == 0) continue;

            int counter = 0;
            int spaces = 0;
            int maxIndex = -1;
            int maxHeight = 0;
            
            // Look for next bar >= current or find tallest bar ahead
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] >= height[i]) {
                    maxIndex = j;
                    break;
                }
                if (height[j] > maxHeight) {
                    maxHeight = height[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != -1) {
                int minHeight = Math.min(height[i], height[maxIndex]);
                spaces = maxIndex - i - 1;

                // Sum the heights between i and maxIndex
                counter = 0;
                for (int k = i + 1; k < maxIndex; k++) {
                    counter += height[k];
                }

                area += (minHeight * spaces) - counter;

                i = maxIndex - 1; // Move i to just before maxIndex
            }
        }
        
        return area;
    }
}


