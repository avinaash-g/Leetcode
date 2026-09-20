class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        if(intervals==null && intervals.length<=1)    
        {
            return intervals;
        }

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        List<int [] > list=new ArrayList<>();
        int [] c=intervals[0];

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=c[1])
            {
                c[1]=Math.max(c[1],intervals[i][1]);
            }
            else
            {
                list.add(c);
                c=intervals[i];
            }

            
        }

        list.add(c);
        return list.toArray(new int [list.size()][]);
    }
}