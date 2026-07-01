# Rotate Array by K Elements

## Problem Statement
Given an array of integers, rotate the array by `k` elements either to the `left` or to the `right`.

## Examples
### Example 1: Right Rotation
- **Input**: `nums = [1, 2, 3, 4, 5, 6, 7]`, `k = 2`, `direction = right`
- **Output**: `[6, 7, 1, 2, 3, 4, 5]`
- **Explanation**:
  - Rotate 1 step to the right: `[7, 1, 2, 3, 4, 5, 6]`
  - Rotate 2 steps to the right: `[6, 7, 1, 2, 3, 4, 5]`

### Example 2: Left Rotation
- **Input**: `nums = [1, 2, 3, 4, 5, 6]`, `k = 2`, `direction = left`
- **Output**: `[3, 4, 5, 6, 1, 2]`
- **Explanation**:
  - Rotate 1 step to the left: `[2, 3, 4, 5, 6, 1]`
  - Rotate 2 steps to the left: `[3, 4, 5, 6, 1, 2]`

---

## Approaches

### 1. Brute Force Approach
Using an auxiliary array to temporarily store the elements that will be shifted, and then placing them back.

#### Left Rotation:
1. Copy the first `k` elements to a temporary array `temp`.
2. Shift the remaining `n - k` elements to the left by `k` positions starting from index `k`.
3. Copy the elements from `temp` back to the end of the original array (indices `n - k` to `n - 1`).

#### Right Rotation:
1. Copy the last `k` elements to a temporary array `temp`.
2. Shift the first `n - k` elements to the right by `k` positions starting from index `n - k - 1` down to `0`.
3. Copy the elements from `temp` back to the beginning of the original array (indices `0` to `k - 1`).

- **Time Complexity**: $O(N)$
- **Space Complexity**: $O(K)$

---

### 2. Optimal Approach (Reversal Algorithm)
This approach rotates the array in-place using a helper function `reverse(arr, start, end)`.

#### Left Rotation:
1. Reverse the first `k` elements: `reverse(arr, 0, k - 1)`
2. Reverse the remaining `n - k` elements: `reverse(arr, k, n - 1)`
3. Reverse the entire array: `reverse(arr, 0, n - 1)`

#### Right Rotation:
1. Reverse the entire array: `reverse(arr, 0, n - 1)`
2. Reverse the first `k` elements: `reverse(arr, 0, k - 1)`
3. Reverse the remaining `n - k` elements: `reverse(arr, k, n - 1)`

- **Time Complexity**: $O(N)$
- **Space Complexity**: $O(1)$