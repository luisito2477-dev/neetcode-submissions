class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] extendedNums = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            extendedNums[i] = nums[i];
            extendedNums[i + nums.length] = nums[i];
        }
        

        return extendedNums;
    }
}