# Count Maximum Consecutive One's in the Array

**Problem Statement:** Given an array containing only `0`s and `1`s, return the count of the maximum consecutive `1`s in the array.

---

## Examples

### Example 1
- **Input:** `prices = [1, 1, 0, 1, 1, 1]`
- **Output:** `3`
- **Explanation:** There are two consecutive 1's and three consecutive 1's in the array, out of which the maximum is 3.

### Example 2
- **Input:** `prices = [1, 0, 1, 1, 0, 1]`
- **Output:** `2`
- **Explanation:** There are two consecutive 1's in the array.

---

## Algorithm

### Optimal Approach (Single Pass)
1. Initialize two integer variables:
   - `count`: to keep track of the current run of consecutive `1`s (initially `0`).
   - `maxCount`: to store the maximum consecutive `1`s seen so far (initially `0`).
2. Iterate through the array from index `0` to `n - 1`:
   - If the current element `arr[i]` is `1`, increment `count` by `1`.
   - If the current element `arr[i]` is `0`, update `maxCount = Math.max(maxCount, count)` and reset `count = 0`.
3. After the loop completes, perform one final check to update `maxCount = Math.max(maxCount, count)` (this handles cases where the array ends with a sequence of `1`s).
4. Return `maxCount`.

**Complexity:**
- **Time Complexity:** $O(N)$ (requires a single traversal of the array)
- **Space Complexity:** $O(1)$ (only uses a few variables for counting)