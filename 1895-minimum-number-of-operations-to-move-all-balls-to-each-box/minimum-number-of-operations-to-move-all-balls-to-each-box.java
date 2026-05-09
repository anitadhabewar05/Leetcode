class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)arr[i]=boxes.charAt(i)-'0';
        int[] pref =new int[n];
        int[] suf = new int[n];
        int oneCnt=0;
        oneCnt = arr[0];
        // pref[0]=oneCnt;
        for(int i=1;i<n;i++){
            pref[i] = pref[i-1]+oneCnt;
            oneCnt += arr[i];
        }
        oneCnt = arr[n-1];
        // suf[n-1]=oneCnt;
        for(int i=n-2;i>=0;i--){
            suf[i] = suf[i+1]+oneCnt;
            oneCnt+=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = pref[i]+suf[i];
        }
        return arr;
    }
}