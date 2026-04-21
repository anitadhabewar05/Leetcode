class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String o : operations) {
            x += (o.charAt(1) == '+' ? 1 : -1);
        }
        return x;
    }
}