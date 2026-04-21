class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        
        for(int i =0;i<strs.length;i++){
        char[] chars = strs[i].toCharArray();

        // Step 2: Sort the array
        Arrays.sort(chars);

        // Step 3: Convert back to String
        String key = new String(chars);
            
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            
        }
        
        return new ArrayList<>(map.values());
        
    }
}
