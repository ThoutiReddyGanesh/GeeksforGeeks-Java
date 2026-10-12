class Solution {
    int majorityElement(int nums[]) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
                for(int x:nums){
                    hm.put(x,hm.getOrDefault(x,0)+1);
                }
                for(int x:nums){
                    if(hm.get(x)>nums.length/2)
                    return x;
                }
               return -1; 
            }
}