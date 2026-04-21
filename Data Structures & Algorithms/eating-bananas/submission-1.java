
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int left = 1;
        int right = piles[piles.length - 1];
        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long totalHours = 0;

            for (int i = 0; i < piles.length; i++) {
                totalHours += (piles[i] + mid - 1) / mid; // ceiling division
            }

            if (totalHours <= h) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}

