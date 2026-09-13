class Solution 
{
    public int minOperations(int[] nums, int x) 
    {
        int total=0;
        for(int i=0;i<nums.length;i++)    
        {
            total+=nums[i];
        }

        int target=total-x;
        if(target==0)
        {
            return nums.length;
        }
        if(target<0)
        {
            return -1;
        }

        int left=0,sum=0,maxLength=0;

        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];

            while(sum>target)
            {
                sum-=nums[left];
                left++;
            }
            if(sum==target)
            {
                maxLength=Math.max(maxLength,right-left+1);
            }
        }

        if(maxLength==0)
        {
            return -1;
        }
        return nums.length-maxLength;
    }
}