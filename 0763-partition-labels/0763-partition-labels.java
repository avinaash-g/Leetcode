class Solution 
{
    public List<Integer> partitionLabels(String s) 
    {
        List <Integer> list=new ArrayList<>();
        Map <Character,Integer> map=new HashMap<>();    
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,i);
        }

        int start=0,end=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            end=Math.max(end,map.get(ch));

            if(i==end)
            {
                int size=end-start+1;
                list.add(size);
                start=i+1;
            }
        }
        return list;
    }
}