class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int maxProduct=nums[0],minProduct=nums[0],result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int currentMax=Math.max(nums[i],Math.max(nums[i]*maxProduct,nums[i]*minProduct));
            int currentMin=Math.min(nums[i],Math.min(nums[i]*maxProduct,nums[i]*minProduct));

            maxProduct=currentMax;
            minProduct=currentMin;

            result=Math.max(result,maxProduct);
        }
        return result;

    }
}