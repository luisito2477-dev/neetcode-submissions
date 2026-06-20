class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> checkedNums = new HashSet<>();

        for(int num: nums){
            if (!checkedNums.contains(num)){
                checkedNums.add(num);
            } else {
                return true;
            }
        }

        return false;
        
    }
}