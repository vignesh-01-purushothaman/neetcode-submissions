class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>>map = new HashMap<>();

        for(int i =0;i<strs.length;i++){
            char [] chars= strs[i].toCharArray();
        Arrays.sort(chars);

        String SortedStrs=new String(chars);
        
        if(!map.containsKey(SortedStrs)){
            map.put(SortedStrs,new ArrayList<>());
        }
        map.get(SortedStrs).add(strs[i]);

        }



         return new ArrayList<>(map.values());





        
    }
}
