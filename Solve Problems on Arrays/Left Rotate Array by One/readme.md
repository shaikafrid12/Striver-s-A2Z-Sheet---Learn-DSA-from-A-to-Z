# Left Rotate the Array by One

**Problem Statement:** Given an integer array `nums`, rotate the array to the left by one.

> [!NOTE]
> Modify the array in-place. There is no need to return anything.

---

## Examples

### Example 1
- **Input:** `nums = [1, 2, 3, 4, 5]`
- **Output:** `[2, 3, 4, 5, 1]`
- **Explanation:** Rotating once to the left results in the first element `1` moving to the end, while all other elements shift one position to the left.

### Example 2
- **Input:** `nums = [-1, 0, 3, 6]`
- **Output:** `[0, 3, 6, -1]`
- **Explanation:** Rotating once to the left results in `-1` moving to the end, while `0`, `3`, and `6` shift one position to the left.

---

## Algorithm

### Brute Force Approach
1. Create an auxiliary/temporary array `temp` of size $N$.
2. Shift the elements from index `1` to `N - 1` of the original array to index `0` to `N - 2` in the `temp` array.
3. Place the first element of the original array (`arr[0]`) at the last position of the `temp` array (`temp[N - 1]`).
4. Copy all elements back from `temp` to the original array.

**Complexity:**
- **Time Complexity:** $O(N)$
- **Space Complexity:** $O(N)$ (requires an auxiliary array of size $N$)

---

### Optimal Approach (In-Place Shift)
1. Store the first element of the array in a temporary variable: `temp = arr[0]`.
2. Iterate through the array from index `1` to `N - 1` and shift each element one position to the left: `arr[i - 1] = arr[i]`.
3. Assign the stored first element to the last position of the array: `arr[N - 1] = temp`.

**Complexity:**
- **Time Complexity:** $O(N)$ (single pass to shift the elements)
- **Space Complexity:** $O(1)$ (modifies the array in-place, requiring no extra space)