# Move all Zeros to the End of the Array

**Problem Statement:** You are given an array of integers. Your task is to move all the zeros in the array to the end of the array and move non-zero elements to the front while maintaining their relative order.

---

## Examples

### Example 1
- **Input:** `arr[] = [1, 0, 2, 3, 0, 4, 0, 1]`
- **Output:** `[1, 2, 3, 4, 1, 0, 0, 0]`
- **Explanation:** All the zeros are moved to the end, and non-zero elements are moved to the front while maintaining their order.

### Example 2
- **Input:** `arr[] = [1, 2, 0, 1, 0, 4, 0]`
- **Output:** `[1, 2, 1, 4, 0, 0, 0]`
- **Explanation:** All the zeros are moved to the end, and non-zero elements are moved to the front while maintaining their order.

---

## Algorithm

### Brute Force Approach
1. Create a temporary array of the same size $N$.
2. Iterate through the original array and copy all non-zero elements into the temporary array sequentially.
3. Fill the remaining slots of the temporary array with zeros.
4. Copy the elements from the temporary array back into the original array.

**Complexity:**
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(N)$ (due to the auxiliary temporary array)

---

### Optimal Approach (Two Pointers / In-Place Swap)
1. Initialize a pointer `j` to `0` to keep track of the position where the next non-zero element should be placed.
2. Iterate through the array with index `i` from `0` to `N - 1`.
3. If `arr[i]` is non-zero:
   - Swap `arr[i]` with `arr[j]`.
   - Increment `j`.
4. This keeps the order of non-zero elements intact while placing them sequentially at the beginning of the array, moving all zeros to the end.

**Complexity:**
- **Time Complexity:** $O(N)$ (performs a single pass over the array)
- **Space Complexity:** $O(1)$ (in-place swap, requires no extra memory)