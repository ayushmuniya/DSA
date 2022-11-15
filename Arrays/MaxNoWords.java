class Solution 
{
    public int mostWordsFound(String[] sentences) 
    {
        int max = 0;
        for(int i=0 ; i<sentences.length ;i++)
        {
            String[] words = sentences[i].split("\\s+");
            int lambaai = words.length;
            max = Math.max(max, lambaai);
        }
        return max;
    }
}
