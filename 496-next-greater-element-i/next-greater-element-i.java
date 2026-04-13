class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int array[]=new int[nums1.length];
        int start=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    start=j;
                    break;
                }
            }
            for(int k=start+1;k<nums2.length;k++){
                if(nums2[k]>nums2[start]){
                    array[i]=nums2[k];
                    break;
                }
            }
            if(array[i]==0){
                array[i]=-1;
            }
        }
    return array;
    }
}