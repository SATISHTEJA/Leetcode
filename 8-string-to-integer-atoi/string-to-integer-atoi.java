class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') 
        {
            i++;
        }
        if (i == n) return 0;
        int alge = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            alge = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        int sol = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            int dig = s.charAt(i) - '0';
            if (sol > (Integer.MAX_VALUE - dig) / 10) {
                return (alge == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            sol = sol * 10 + dig;
            i++;
        }

        return sol * alge;
    }
}
