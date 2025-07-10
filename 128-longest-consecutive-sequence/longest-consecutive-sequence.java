class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        Arrays.sort(nums);
        int max=1, c=1;
        for (int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                continue;
            } 
            else if (nums[i]==nums[i-1] +1)
            {
                c++;
            }
            else{
                c=1;
            }
            max = Math.max(max,c);
        }
        return max;
    }
}