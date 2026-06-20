class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        checked_chars: dict[str] = {}

        for char in s:
            checked_chars[char] = checked_chars.get(char, 0) + 1

        for char in t:
            if char not in checked_chars:
                return False
            if checked_chars[char] == 0:
                return False
            checked_chars[char] -= 1
        
        return True
        