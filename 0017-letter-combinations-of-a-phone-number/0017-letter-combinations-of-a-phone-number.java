class Solution 
{
    static void BTrack(int index, String digits, StringBuilder path,List<String> result, Map<Character, String> mp)
    {
        if(index==digits.length())
        {
            result.add(path.toString());
            return;
        }

        String let = mp.get(digits.charAt(index));
        for (char c : let.toCharArray()) 
        {
            path.append(c);
            BTrack(index + 1, digits, path, result, mp);
            path.deleteCharAt(path.length() - 1); 
        }
    }    
    
    
    public List<String> letterCombinations(String digits) 
    {
        HashMap <Character,String> mp=new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");    


        if(digits.length()==0||digits==null)
        {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();

        BTrack(0,digits,new StringBuilder(),result,mp);   

        return result;
    }
}