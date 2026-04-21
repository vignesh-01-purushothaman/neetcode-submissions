class Solution {
    public int[] twoSum(int[] nums, int target) {

        int arr[]=new int[2];

        HashMap<Integer,Integer>map= new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                arr = new int[] { map.get(target - nums[i]),i };

            }

            map.put(nums[i],i);


        }

        return arr;


        
    }
}
