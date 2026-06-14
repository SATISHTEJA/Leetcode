class Solution {
    public int maximumDifference(int[] nums) {
        int soln = -1;
        int min = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] > min)
            {
                soln = Math.max(soln,nums[i] - min);
            }
            min = Math.min(min,nums[i]);
        }
        if(soln == 0)
            soln = -1;
        return soln;
    }
}