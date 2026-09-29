class Solution 
{
    public int romanToInt(String s) 
    {
        int result=0;  
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);    
            int curr=0;
            switch(ch)
            {
                case 'I':
                    curr=1;
                    break;
                case 'V':
                    curr=5;
                    break;
                case 'X':
                    curr=10;
                    break;
                case 'L':
                    curr=50;
                    break;
                case 'C':
                    curr=100;
                    break;
                case 'D':
                    curr=500;
                    break;
                case 'M':
                    curr=1000;
                    break;                
            }
            int next=0;
            if(i+1<s.length())
            {
                char nextch=s.charAt(i+1);
                switch(nextch)
                {
                    case 'I':
                        next=1;
                        break;
                    case 'V':
                        next=5;
                        break;
                    case 'X':
                        next=10;
                        break;
                    case 'L':
                        next=50;
                        break;
                    case 'C':
                        next=100;
                        break;
                    case 'D':
                        next=500;
                        break;
                    case 'M':
                        next=1000;
                        break;
                }
            }
            if(curr<next)
            {
                result-=curr;
            }
            else
            {
                result+=curr;
            }
        }
        return result;
    }
}