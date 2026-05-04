class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result= new char[s.length()];
        for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
         result[indices[i]]=ch;
        }
        return new String(result);
    }
}