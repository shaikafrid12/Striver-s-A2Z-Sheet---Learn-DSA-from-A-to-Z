# Length of the Longest Subarray with Zero Sum

**Problem Statement:** Given an array containing both positive and negative integers, find the length of the longest subarray with the sum of all elements equal to zero.

---

## Examples

### Example 1:
- **Input:** `N = 6`, `array[] = {9, -3, 3, -1, 6, -5}`  
- **Result:** `5`  
- **Explanation:** The following subarrays sum to zero:
  - `{-3, 3}` (length 2)
  - `{-1, 6, -5}` (length 3)
  - `{-3, 3, -1, 6, -5}` (length 5)
  
  The length of the longest subarray with sum zero is 5.

### Example 2:
- **Input:** `N = 8`, `array[] = {6, -2, 2, -8, 1, 7, 4, -10}`  
- **Result:** `8`  
- **Explanation:** Subarrays with sum zero:
  - `{-2, 2}` (length 2)
  - `{-8, 1, 7}` (length 3)
  - `{-2, 2, -8, 1, 7}` (length 5)
  - `{6, -2, 2, -8, 1, 7, 4, -10}` (length 8)
  
  The length of the longest subarray with sum zero is 8.

---

## Algorithm

We can solve this problem using two approaches: a Brute Force approach and an Optimal approach (using Hashing).

### Step-by-Step Approach (Brute Force):
1. **Initialize**: Keep a variable `maxLen = 0` to store the maximum length of the subarray with sum zero.
2. **Outer Loop**: Traverse the array from index `i = 0` to `n-1` (which represents the starting point of the subarray).
3. **Inner Loop**: For each starting point `i`, maintain a running `sum = 0` and traverse from `j = i` to `n-1`.
   - Add `arr[j]` to the running `sum`.
   - If `sum` becomes `0`, update `maxLen = Math.max(maxLen, j - i + 1)`.
4. **Result**: Return `maxLen`.

### Step-by-Step Approach (Optimal Approach - Hashing):
1. **Initialize**: Keep a variable `maxLen = 0`, a running prefix `sum = 0`, and a hash map to store `(prefix sum, index)`.
2. **Traverse**: Traverse through the array from `i = 0` to `n-1`:
   - Add `arr[i]` to `sum`.
   - If `sum` is equal to `0`, then the subarray from index `0` to `i` has a sum of zero. Update `maxLen = i + 1`.
   - If `sum` already exists in the map:
     - The sum of elements between the index stored in the map and the current index `i` is zero.
     - Update `maxLen = Math.max(maxLen, i - map.get(sum))`.
   - If `sum` does not exist in the map:
     - Store the prefix sum with its index: `map.put(sum, i)`. *(Only store if it's not present to keep the earliest index, ensuring maximum length)*.
3. **Result**: Return `maxLen`.

---

## Complexity Analysis

### Brute Force:
- **Time Complexity:** $O(N^2)$ (due to two nested loops).
- **Space Complexity:** $O(1)$ auxiliary space.

### Optimal Approach (Hashing):
- **Time Complexity:** $O(N)$ (as we traverse the array only once and map operations take $O(1)$ average time).
- **Space Complexity:** $O(N)$ (to store the prefix sums in the hash map).