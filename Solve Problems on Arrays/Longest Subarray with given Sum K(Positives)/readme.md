# Longest Subarray with given Sum K (Positives)

**Problem Statement:** Given an array `nums` of size `n` and an integer `k`, find the length of the longest sub-array that sums to `k`. If no such sub-array exists, return `0`.

---

## Examples

### Example 1:
- **Input:** `nums = [10, 5, 2, 7, 1, 9]`, `k = 15`  
- **Output:** `4`  
- **Explanation:** The longest sub-array with a sum equal to 15 is `[5, 2, 7, 1]`, which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

### Example 2:
- **Input:** `nums = [2, 3, 5, 1, 9]`, `k = 10`  
- **Output:** `3`  
- **Explanation:** The longest sub-array with a sum equal to 10 is `[2, 3, 5]`, which has a length of 3. This sub-array starts at index 0 and ends at index 2, and the sum of its elements (2 + 3 + 5) equals 10. Therefore, the length of this sub-array is 3.

---

## Algorithm

We can solve this problem using two approaches: a Brute Force approach and an Optimal approach (using Two-Pointer / Sliding Window).

### Step-by-Step Approach (Brute Force):
1. **Generate Subarrays**: Run three nested loops to generate all possible contiguous subarrays.
2. **Calculate Sum**: For each subarray starting at index `i` and ending at index `j`, calculate the sum of its elements using a loop variable `k` from `i` to `j`.
3. **Compare**: If the sum equals `k`, compute the length `(j - i + 1)` and update the maximum length `maxLen`.

*(Note: We can optimize this slightly to $O(N^2)$ by calculating the running sum on the fly in the second loop).*

### Step-by-Step Approach (Optimal Approach - Two-Pointer / Sliding Window):
1. **Initialize**: Use two pointers `left = 0` and `right = 0` to represent the sliding window. Keep variables `currentsum = 0` and `maxLen = 0`.
2. **Expand Window**: Move the `right` pointer to include elements in the window and add `arr[right]` to `currentsum`.
3. **Shrink Window**: If `currentsum` exceeds `k`, subtract elements from the left of the window and increment the `left` pointer until `currentsum` is less than or equal to `k`.
4. **Compare**: If `currentsum == k`, calculate the current subarray length `(right - left + 1)` and update `maxLen = Math.max(maxLen, right - left + 1)`.
5. **Repeat**: Repeat this until the `right` pointer reaches the end of the array.

---

## Complexity Analysis

### Brute Force:
- **Time Complexity:** $O(N^3)$ (or $O(N^2)$ if running sum is calculated on the fly).
- **Space Complexity:** $O(1)$ auxiliary space.

### Optimal Approach (Two-Pointer):
- **Time Complexity:** $O(N)$ (as both `left` and `right` pointers traverse the array at most once).
- **Space Complexity:** $O(1)$ auxiliary space.