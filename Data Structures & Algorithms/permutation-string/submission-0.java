

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] window = new int[26];

        if (s1.length() > s2.length()) return false;
        for (int n = 0; n < s1.length(); n++) {
            freq[s1.charAt(n) - 'a']++;
        }

        int k = s1.length();
        for (int i = 0; i < k; i++) {
            window[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq, window)) return true;

        for (int i = k; i < s2.length(); i++) {

            window[s2.charAt(i) - 'a']++;

        
            window[s2.charAt(i - k) - 'a']--;

            if (Arrays.equals(freq, window)) return true;
        }

        return false;
    }
}
