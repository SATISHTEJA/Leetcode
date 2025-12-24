class Solution {
    public int scoreOfString(String s) 
    {
        int sol = 0;
        for(int i =0;i < s.length() - 1;i++)
            sol = sol + Math.abs(s.charAt(i) - s.charAt(i + 1));
        return sol;
    }
}