class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();


        for(int i =0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String Sortedkey=new String(arr);

            if(!map.containsKey(Sortedkey)){
                map.put(Sortedkey, new ArrayList<>());
            }

            map.get(Sortedkey).add(strs[i]);




        }

         return new ArrayList<>(map.values());


        
    }
}
