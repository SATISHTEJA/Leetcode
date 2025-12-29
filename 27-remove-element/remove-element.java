class Solution {
    public int removeElement(int[] nums, int val)
    {
        int k=0;
        int ans = nums.length;
        while( k < ans)
        {
            if(nums[k] == val)
            {
                nums[k] = nums[ans - 1];
                ans--;
            }
            else
            {
                k++;
            }
        }
        return ans;
    }
}