class Solution {
    public int singleNumber(int[] nums) {

        int xorResult = 0;

        for(int i =0;i<nums.length;i++){
            xorResult = xorResult ^ nums[i];

        }


        return xorResult;




















        
    }
}
