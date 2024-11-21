# My Solution
O(n<sup>2</sup>) solution which goes through each character of the string as a starting point then finds the longest string from there until it reaches a repeating character. The maximum length at each iteration is recorded.

# More optimal solution

This can be solved using the sliding window technique. Maintain two pointers, i and j and a set to keep track of which characters have been used in the current substring. The steps are as follows:
1. set max, i and j to 0
2. If current character is in set, calculate the value of j-i (window size) then set it as max if it is larger. Then increase i by 1 and remove current character from the set until the current character is no longer in the used characters.
3. Increase j by 1
4. Until j is equal to the length of the string and return the value of max

