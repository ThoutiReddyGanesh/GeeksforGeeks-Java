class Solution {
    boolean twoSum(int nums[],int target) {
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(hs.contains(target-nums[i]))
                return true;
            hs.add(nums[i]);
        }

        return false;
    }
}