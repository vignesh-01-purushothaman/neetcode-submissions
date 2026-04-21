class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>>map = new HashMap<>();

        for(int i = 0; i<strs.length; i++){
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String SortedS = new String (arr);
            if(map.containsKey(SortedS)){
                map.get(SortedS).add(strs[i]);
            }
            else{
                map.put(SortedS,new ArrayList<>());
                map.get(SortedS).add(strs[i]);
            }
        }

        return new ArrayList<>(map.values());
        
    }
}
