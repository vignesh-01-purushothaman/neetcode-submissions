class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
            List<List<Integer>> arr = new ArrayList<>();
            for(int i = 0;i<nums.length-2;i++){
                int  l =i+1;
            int m = nums.length-1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
                while(l<m){
                if(nums[i]+nums[l]+nums[m]<0){
                    l++;
                }
                else if (nums[i]+nums[l]+nums[m]>0){
                    m--;
                }
                else{
                    arr.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[m])));
                    while (l < m && nums[l] == nums[l + 1]) l++;
                    while (l < m && nums[m] == nums[m - 1]) m--;
                    l++;
                    m--;
                }
                }
               

                
                }
                return arr;
            }
        }