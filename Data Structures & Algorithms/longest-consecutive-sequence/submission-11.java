class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int temp = 0;

        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);

        }

        int maxcount=1;
        int counter=1;
        if(nums.length==0){
            return 0;
        }
        else{
        for(int i =0;i<nums.length;i++){
            if (!set.contains(nums[i] - 1)){
                temp = nums[i]+1;
                while(set.contains(temp)){
                    counter++;
                    temp++;
                    
                }
                if(counter>maxcount){
                    maxcount=counter;
                }

                counter=1;
            }
        }


        }

        return maxcount;
        
    }
}
