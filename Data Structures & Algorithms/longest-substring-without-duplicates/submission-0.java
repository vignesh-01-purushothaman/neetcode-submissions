

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Edge case: empty string
        if (s == null || s.length() == 0) return 0;

        int left = 0;
        int maxCount = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            // If char already in window, shrink from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current char
            set.add(s.charAt(right));

            // Update max length
            maxCount = Math.max(maxCount, right - left + 1);
        }

        return maxCount;
    }
}

