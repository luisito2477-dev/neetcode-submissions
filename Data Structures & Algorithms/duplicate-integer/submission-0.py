class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        checked_nums: set[int] = set()

        for num in nums:
            if num not in checked_nums:
                checked_nums.add(num)
            else: return True

        return False
        