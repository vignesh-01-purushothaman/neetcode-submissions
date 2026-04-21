class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int row = 0; row < m; row++) {
            int left = 0, right = n - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (matrix[row][mid] == target) return true;
                else if (matrix[row][mid] < target) left = mid + 1;
                else right = mid - 1;
            }
        }
        return false;
    }
}
        
