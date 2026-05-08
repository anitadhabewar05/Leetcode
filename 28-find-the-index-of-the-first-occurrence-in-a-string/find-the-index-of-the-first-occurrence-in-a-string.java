class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder sb=new StringBuilder();
        int h=haystack.length();
        int n=needle.length();
        for(int i=0;i<haystack.length();i++){
            sb.append(haystack.charAt(i));
            if(sb.length()>n){
                sb.deleteCharAt(0);
            }
            if(sb.length()==n && sb.toString().equals(needle)){
                return i-n+1;
            }

        }
        return -1;
    }
}