class Solution {
    public String Reversing(String s)
    {
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed;
    }
    public int maximumNumberOfStringPairs(String[] words) 
    {
        int javab = 0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1; j<words.length;j++)
            {
                if(!words[j].equals("0"))
                {
                    String revb = Reversing(words[j]);
                    if(words[i].equals(revb))
                    {
                        javab++;
                        words[j] = "0";
                        words[i] = "0";
                        break;
                    }
                }
            }
        }
        return javab;
    }
}