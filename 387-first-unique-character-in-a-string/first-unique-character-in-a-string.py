class Solution:
    def firstUniqChar(self, s: str) -> int:
        MAX_CHAR=26
        freq = [0] * MAX_CHAR
        for c in s:
            freq[ord(c) - ord('a')] += 1
        for i, c in enumerate(s):
            if freq[ord(c) - ord('a')] == 1:
                return i
        return -1
        