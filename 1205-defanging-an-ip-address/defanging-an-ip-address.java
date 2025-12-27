class Solution {
    public String defangIPaddr(String address) 
    {
        String sol = "";
        for(int i=0; i< address.length();i++)
        {
            if(address.charAt(i) != '.')
            {
                sol = sol + address.charAt(i);
            }
            else
            {
                sol += "[.]";
            }
        }
        return sol;
    }
}