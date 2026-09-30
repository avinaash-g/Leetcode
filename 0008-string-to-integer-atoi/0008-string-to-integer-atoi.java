class Solution 
{
    public int myAtoi(String s) 
    {
        int i=0,sign=1,result=0;    
        while(i<s.length() && s.charAt(i)==' ')
        {
            i++;
        }

        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-'))
        {
            if(s.charAt(i)=='-')
            {
                sign=-1;
            }
            i++;
        }
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9')
        {
            char ch=s.charAt(i);
            int digit=ch-'0';
            if(result>(Integer.MAX_VALUE-digit)/10)
            {
                if(sign==1)
                {
                    return Integer.MAX_VALUE;
                }
                else
                {
                    return Integer.MIN_VALUE;
                }
            }
            result=result*10+digit;
            i++;
        }
        return result*sign;
    }
}