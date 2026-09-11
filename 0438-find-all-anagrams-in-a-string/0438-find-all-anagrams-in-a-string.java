class Solution 
{
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> list=new ArrayList<>();

        Map <Character,Integer> map=new HashMap<>();

        for(int i=0;i<p.length();i++) 
        {
            char ch=p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int left=0;
        Map <Character,Integer> freq=new HashMap<>();

        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            freq.put(ch,freq.getOrDefault(ch,0)+1);

            while(right-left+1>p.length())
            {
                char re=s.charAt(left);
                freq.put(re,freq.get(re)-1);

                if(freq.get(re)==0)
                {
                    freq.remove(re);
                }
                left++;
            }

            if(map.equals(freq))
            {
                list.add(left);
            }
        }
        return list;
    }
}