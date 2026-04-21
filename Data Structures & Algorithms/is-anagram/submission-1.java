class Solution {
    public boolean isAnagram(String s, String t) {
         char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(arr2);
        
        String SortedS=new String(arr);
        String SortedT=new String(arr2);
        
         return SortedS.equals(SortedT);
        





    }
}
