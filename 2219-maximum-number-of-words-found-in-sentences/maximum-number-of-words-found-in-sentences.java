class Solution 
{
    public int mostWordsFound(String[] sentences) 
    {
        int javab = 0;
        for(int i =0;i<sentences.length;i++)
        {
            int ans = 1;
            for(int j = 0;j<sentences[i].length();j++)
            {
                if(sentences[i].charAt(j) == ' ')
                    ans++;
            }
        javab = Math.max(javab,ans);
        }
        return javab;
    }
}