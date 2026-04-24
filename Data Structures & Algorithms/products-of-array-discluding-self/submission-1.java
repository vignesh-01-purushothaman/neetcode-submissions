class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] pref = new int [nums.length];
        int [] suff = new int[nums.length];

        int [] res = new int[nums.length];
        int prepro = 1;
        int sufpro=1;
        suff[0]=1;
        pref[nums.length-1]=1;
        for(int i = 1;i<nums.length;i++){
            sufpro=sufpro*nums[i-1];
            suff[i]=sufpro;
        }

        for(int i = nums.length-2;i>=0;i--){
            prepro=prepro*nums[i+1];
            pref[i]=prepro;
        }

        for(int i =0;i<nums.length;i++){
            res[i]= suff[i]*pref[i];
        }

        return res;

        
    }
}  










