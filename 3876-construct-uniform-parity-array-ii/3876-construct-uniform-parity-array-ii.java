class Solution {
    public boolean uniformArray(int[] nums1) {
        int mini = Integer.MAX_VALUE;
        boolean hasEven = false;
        boolean hasOdd = false;
        for(int nums : nums1){
            if(nums < mini){
                mini = nums;
            }
            if(nums%2 == 0){
                hasEven = true;
            }
            else{
                hasOdd = true;
            }
        }
        return !hasEven || !hasOdd || (mini%2 != 0);
    }
}