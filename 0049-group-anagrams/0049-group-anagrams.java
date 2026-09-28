class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            String str=strs[i];
            int[] count=new int[26];

            for(int j=0;j<str.length();j++)
            {
                count[str.charAt(j)-'a']++;
            }

            String key="";

            for(int j=0;j<26;j++)
            {
                key=key+count[j]+"#";
            }

            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}