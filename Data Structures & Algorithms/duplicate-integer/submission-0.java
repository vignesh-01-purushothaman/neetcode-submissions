public class BubbleSort {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] num) {
        int n = num.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }
}

class Solution {

    public boolean hasDuplicate(int[] nums) {
        // Sort the array first
        BubbleSort.bubbleSort(nums);
        
        // Check for adjacent duplicates
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        
        return false;
    }
}
