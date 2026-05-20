class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int nums1[] = new int[n];
        for(int i=0;i<nums.length;i++){
            int ar=nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(ar>nums[j]){
                    count++;
                }
            }
            nums1[i]=count;

        }
        return nums1;
    }
}
