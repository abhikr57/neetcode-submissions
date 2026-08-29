class Solution {
    public int majorityElement(int[] nums) {
        int cnt=1;
        int major =nums[0];
        for(int i=1;i<nums.length;i++){
            if(major==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
             if(cnt==0){
                major=nums[i];
                cnt=1;
             }
        }
        return major;
    }
}