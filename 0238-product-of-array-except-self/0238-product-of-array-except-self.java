class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int[] result=new int [nums.length];
        int leftSum=1;
        for(int i=0;i<nums.length;i++)    
        {
            result[i]=leftSum;
            leftSum*=nums[i];
        }

        int rightSum=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            result[i]*=rightSum;
            rightSum*=nums[i];
        }
        return result;
    }
}