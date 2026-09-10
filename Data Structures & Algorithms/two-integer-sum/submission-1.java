class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> list = new HashMap<>();
         
         
         for(int i=0; i<nums.length; i++){
           
            int count = target - nums[i];
            if(list.containsKey(count)){
                return new int[]{list.get(count), i};
            }
            list.put(nums[i], i);

            }
            return null;
         }
    }

