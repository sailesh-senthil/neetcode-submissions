class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> count = new HashSet<Integer>();
        for(int i : nums){
            if(count.contains(i)){
                return true;
            }
            count.add(i);

        }

        return false;

        
    }
}