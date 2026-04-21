class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            char [] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String Sortedstr= new String(arr);

            if(map.containsKey(Sortedstr)){
                map.get(Sortedstr).add(strs[i]);
            }
            else{
                map.put(Sortedstr,new ArrayList<>());
                map.get(Sortedstr).add(strs[i]);

            }
        }

        return new ArrayList<>(map.values());

    }
}
