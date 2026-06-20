class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # {"value": "index"}
        checked_nums: dict = {}

        for i in range(len(nums)):
            complement: int = target - nums[i]

            if complement in checked_nums:
                return [checked_nums[complement], i]
            
            checked_nums[nums[i]] = i