class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n =nums.length;
        int counter=0;
        int maxcounter=0;
        if(nums.length==0){
            return 0;
        }
        for(int i =0;i<n;i++){
            set.add(nums[i]);

        }

        for(int i=0;i<n;i++){
            int right = nums[i];
            if(!set.contains(nums[i]-1)){
                while(set.contains(right)){
                    right++;
                    counter++;
                
                if(counter>=maxcounter){
                    maxcounter=counter;
                }

                }
                counter=0;
            }
        }

        return maxcounter;
        
    }
}
