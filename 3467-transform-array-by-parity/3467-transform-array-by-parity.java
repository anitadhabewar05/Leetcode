class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }else{
                nums[i] = 1;
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        return nums;
    }
}