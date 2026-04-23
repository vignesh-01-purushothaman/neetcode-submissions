class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap <>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        List<Integer> [] bucket = new ArrayList[nums.length+1];

        for(int key : map.keySet()){
           int freq = map.get(key);

           if(bucket[freq]==null){
            bucket[freq]=new ArrayList<>();
            
           }
           bucket[freq].add(key);
        }

        int [] res = new int [k];
        int index= 0;

        for(int i =nums.length;i>=0&&index<k;i--){
            if(bucket[i]!=null){
                    for(int num:bucket[i]){
                        res[index++]=num;
                        if(index==k){
                            break;
                        }
                    }
                

            }
        }


        return res;

        
    }
}
