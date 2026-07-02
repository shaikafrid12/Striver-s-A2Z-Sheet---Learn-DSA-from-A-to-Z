# Linear Search

**Problem Statement:** Given an array and an element `num`, find if `num` is present in the given array. If present, print the 0-based index of the element; otherwise, print `-1`.

---

## Examples

### Example 1
- **Input:** `arr[] = [1, 2, 3, 4, 5]`, `num = 3`
- **Output:** `2`
- **Explanation:** `3` is present at index `2` of the array.

### Example 2
- **Input:** `arr[] = [5, 4, 3, 2, 1]`, `num = 5`
- **Output:** `0`
- **Explanation:** `5` is present at index `0` of the array.

---

## Algorithm

Linear Search is a sequential search algorithm that starts at one end and goes through each element of a list until the desired element is found.

### Step-by-Step Approach:
1. Traverse the array sequentially from index `0` to `N - 1`.
2. In each iteration, compare the current element `arr[i]` with the target element `num`.
3. If `arr[i] == num`, print the current index `i` and terminate the search.
4. If the loop completes without finding the element, print `-1`.

**Complexity:**
- **Time Complexity:** 
  - **Worst Case:** $O(N)$ (occurs if the element is at the end of the array or not present at all)
  - **Best Case:** $O(1)$ (occurs if the element is at the first index)
- **Space Complexity:** $O(1)$ (requires no extra memory)