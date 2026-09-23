class Solution 
{
    public String largestNumber(int[] nums) 
    {
        StringBuilder sb=new StringBuilder();
        String[] strings=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            strings[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(strings,(a,b)->{return (b+a).compareTo(a+b);});
        if(strings[0].equals("0"))
        {
            return "0";
        }

        for(String s:strings)
        {
            sb.append(s);
        }
        return sb.toString();
    }
}