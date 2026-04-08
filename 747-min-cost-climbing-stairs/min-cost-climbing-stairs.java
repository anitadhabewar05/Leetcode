class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int length=cost.length;
         int n1=cost[0];
         int n2=cost[1];
         for(int i=2; i<length; i++)
         {
            int res=cost[i]+Math.min(n1,n2);
            n1=n2;
            n2=res;
         }
         return Math.min(n1,n2);
    }
}