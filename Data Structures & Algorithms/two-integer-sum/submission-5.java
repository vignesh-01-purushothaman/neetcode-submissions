class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map =  new HashMap <>();
        int[] out = new int [2];

        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                out[0]= map.get(target-nums[i]);
                map.put(nums[i],i);
                out[1]= map.get(nums[i]);
            }
            else{
                map.put(nums[i],i);
            }

            
        }

        return out;

        
    }
}
