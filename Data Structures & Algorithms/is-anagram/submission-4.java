class Solution {
    public boolean isAnagram(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);

        String SortedS = new String (S);
        String SortedT = new String (T);

        if(SortedS.equals(SortedT)){
            return true;
        }

        else{
            return false;
        }



        


    }
}
