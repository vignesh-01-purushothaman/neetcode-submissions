class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        int pivot = l;

        int left = 0, right = pivot - 1;
        while (left <= right) {
            int mid2 = (left + right) / 2;
            if (nums[mid2] == target) return mid2;
            else if (nums[mid2] < target) left = mid2 + 1;
            else right = mid2 - 1;
        }

        left = pivot;
        right = nums.length - 1;
        while (left <= right) {
            int mid3 = (left + right) / 2;
            if (nums[mid3] == target) return mid3;
            else if (nums[mid3] < target) left = mid3 + 1;
            else right = mid3 - 1;
        }

        return -1;
    }
}