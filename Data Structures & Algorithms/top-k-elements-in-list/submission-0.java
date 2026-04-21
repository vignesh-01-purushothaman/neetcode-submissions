class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        List<List<Integer>> bucket = new ArrayList<>();
        
        for(int i =0;i<=nums.length;i++){
            bucket.add(new ArrayList<>());
        }
        for (int key : map.keySet()){
            int freq = map.get(key);
            bucket.get(freq).add(key);
        }
        
        List<Integer> resultList = new ArrayList<>();
        for (int i = bucket.size() - 1; i >= 0 && resultList.size() < k; i--) {
            for (int num : bucket.get(i)) {
                resultList.add(num);
                if (resultList.size() == k) break;
            }
        }

        // Step 5: Convert to array
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = resultList.get(i);
        }

        return res;
    }
        
    }
