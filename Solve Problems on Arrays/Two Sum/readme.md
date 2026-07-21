# Two Sum : Check if a pair with given sum exists in Array

## Problem Statement
Given an array of integers `arr[]` and an integer `target`.

- **1st variant:** Return `YES` if there exist two numbers such that their sum is equal to the target. Otherwise, return `NO`.
- **2nd variant:** Return indices of the two numbers such that their sum is equal to the target. Otherwise, return `{-1, -1}`.

## Examples

### Example 1
- **Input:** `N = 5`, `arr[] = {2, 6, 5, 8, 11}`, `target = 14`
- **Output:** `YES` (1st variant), `[1, 3]` (2nd variant)
- **Explanation:** `arr[1] + arr[3] = 6 + 8 = 14`. So, the answer is `YES` for the first variant and `[1, 3]` for the second variant.

### Example 2
- **Input:** `N = 5`, `arr[] = {2, 6, 5, 8, 11}`, `target = 15`
- **Output:** `NO` (1st variant), `[-1, -1]` (2nd variant)
- **Explanation:** There exist no such two numbers whose sum is equal to the target.

## Algorithms

### 1. Brute Force Approach
Check every possible pair of elements in the array and see if their sum is equal to the target.

- **Algorithm:**
  1. Run a loop from `i = 0` to `n - 1` representing the first element of the pair.
  2. Run an inner loop from `j = i + 1` to `n - 1` representing the second element of the pair.
  3. If `arr[i] + arr[j] == target`, then we found the pair:
     - For the **1st variant**, return `YES`.
     - For the **2nd variant**, return the indices `{i, j}`.
  4. If the loops complete without finding any such pair, return `NO` (1st variant) or `{-1, -1}` (2nd variant).
- **Time Complexity:** $O(N^2)$ due to the nested loops.
- **Space Complexity:** $O(1)$ as we are not using any extra space.

---

### 2. Better Approach (Using Hashing)
Use a hash map to store elements we have seen so far and their indices. For each element `arr[i]`, we check if its complement (`target - arr[i]`) exists in the hash map.

- **Algorithm:**
  1. Initialize an empty hash map to store `(element, index)`.
  2. Iterate through the array from `i = 0` to `n - 1`:
     - Calculate the required complement: `rem = target - arr[i]`.
     - Check if `rem` exists in the hash map:
       - If it does, we found the pair!
         - For the **1st variant**, return `YES`.
         - For the **2nd variant**, return the index of `rem` (from the map) and the current index `i`, i.e., `{map.get(rem), i}`.
       - If it doesn't, add the current element and its index to the map: `map.put(arr[i], i)`.
  3. If the loop completes and we haven't returned, it means no such pair exists. Return `NO` (1st variant) or `{-1, -1}` (2nd variant).
- **Time Complexity:** $O(N)$ on average (assuming hash map operations are $O(1)$).
- **Space Complexity:** $O(N)$ to store array elements in the hash map.