class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==0)    
        {
            return "";
        }

        String prefix=strs[0];
        for(int i=0;i<strs.length;i++)
        {
            String curr=strs[i];


            while(!curr.startsWith(prefix))
            {
                if(prefix.length()==0)
                {
                    return "";
                }
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}