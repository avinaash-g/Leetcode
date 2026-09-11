class Solution 
{
    public List<Integer> findSubstring(String s, String[] words) 
    {
        List<Integer> list=new ArrayList<>();

        Map<String,Integer> map=new HashMap<>();

        for(int i=0;i<words.length;i++)    
        {
            String sh=words[i];
            map.put(sh,map.getOrDefault(sh,0)+1);
        }

        int WLength=words[0].length();
        int TLength=WLength*words.length;

        for(int i=0;i<=s.length()-TLength;i++)
        {
            Map<String,Integer> freq=new HashMap<>();

            for(int j=0;j<words.length;j++)
            {
                int start=i+j*WLength;
                String word=s.substring(start,start+WLength);
                freq.put(word,freq.getOrDefault(word,0)+1);
            }

            if(map.equals(freq))
            {
                list.add(i);
            }
        }
        return list;
    }
}