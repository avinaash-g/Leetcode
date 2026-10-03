class Solution 
{
    public String countAndSay(int n) 
    {
        String curr = "1";

        for (int i = 1; i < n; i++) 
        {
            String next = "";
            int k = 0;

            while (k < curr.length()) 
            {
                int count = 1;

                while (k < curr.length() - 1 && curr.charAt(k) == curr.charAt(k + 1)) 
                {
                    count += 1;
                    k += 1;
                }

                next += Integer.toString(count) + curr.charAt(k);
                k += 1;
            }

            curr = next;
        }

        return curr;
    }
}