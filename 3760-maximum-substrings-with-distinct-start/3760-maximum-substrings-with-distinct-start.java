class Solution {
    public int maxDistinct(String s) {
        boolean[] ar = new boolean[26];
        int c = 0 ;

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);

            if(!ar[ch-'a'])
            {
                ar[ch-'a'] = true;
                c++;
            }
        }
        return c;
    }
}