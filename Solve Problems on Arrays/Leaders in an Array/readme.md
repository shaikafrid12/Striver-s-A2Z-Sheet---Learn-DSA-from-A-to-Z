# Leaders in an Array

## Problem Statement
Given an integer array `arr` of size `n`, find all the **leaders** in the array. 
An element is considered a **leader** if it is strictly greater than all the elements to its right side. The rightmost element is always a leader.

---

## Examples

### Example 1
- **Input:** `arr = [4, 7, 1, 0]`
- **Output:** `[7, 1, 0]`
- **Explanation:**
  - `0` is the rightmost element, so it is always a leader.
  - `1` is strictly greater than `0`.
  - `7` is strictly greater than `1` and `0`.
  - `4` is not greater than `7`, so it is not a leader.

### Example 2
- **Input:** `arr = [10, 22, 12, 3, 0, 6]`
- **Output:** `[22, 12, 6]`
- **Explanation:**
  - `6` is a leader because there are no elements to its right.
  - `12` is greater than all elements to its right (`3`, `0`, `6`).
  - `22` is greater than all elements to its right (`12`, `3`, `0`, `6`).

---

## Algorithms

### 1. Brute Force Approach
1. Initialize an empty list `leaders` to store the results.
2. Loop through each element `arr[i]` from index `0` to `n - 1`:
   - Assume `arr[i]` is a leader (`is_leader = true`).
   - Run a nested loop from `j = i + 1` to `n - 1`:
     - If `arr[j] >= arr[i]`, then `arr[i]` is not a leader. Set `is_leader = false` and break the loop.
   - If `is_leader` remains `true`, add `arr[i]` to `leaders`.
3. Return `leaders`.

### 2. Optimal Approach (Scan from Right-to-Left)
1. Initialize an empty list `leaders` to store the results.
2. Set `max_leader` to the rightmost element `arr[n - 1]`.
3. Add `max_leader` to the `leaders` list.
4. Iterate through the array backwards from index `n - 2` down to `0`:
   - If the current element `arr[i]` is strictly greater than `max_leader`:
     - Update `max_leader = arr[i]`.
     - Add `arr[i]` to `leaders`.
5. Reverse the `leaders` list to restore the original left-to-right order.
6. Return `leaders`.

---

## Complexity Analysis

| Approach | Time Complexity | Space Complexity |
| :--- | :--- | :--- |
| **Brute Force** | $O(N^2)$ | $O(N)$ (to store output) |
| **Optimal Approach** | $O(N)$ | $O(N)$ (to store output) |