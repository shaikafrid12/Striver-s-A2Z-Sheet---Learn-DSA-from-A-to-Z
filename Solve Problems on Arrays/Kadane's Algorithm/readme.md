# Kadane's Algorithm: Maximum Subarray Sum in an Array

## Problem Statement
Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return *its sum*.

> **Subarray**: A subarray is a contiguous non-empty sequence of elements within an array.

---

## Examples

### Example 1
- **Input:** `nums = [2, 3, 5, -2, 7, -4]`
- **Output:** `15`
- **Explanation:** The subarray `[2, 3, 5, -2, 7]` (index 0 to 4) has the largest sum = `15`.

### Example 2
- **Input:** `nums = [-2, -3, -7, -2, -10, -4]`
- **Output:** `-2`
- **Explanation:** The largest sum is `-2`, which comes from the subarray `[-2]` (at index 0 or index 3). Since all numbers are negative, the subarray with the least negative number gives the largest sum.

---

## Algorithms & Approaches

### 1. Brute Force Approach
In this approach, we find the sum of all possible subarrays and keep track of the maximum sum.
- **Algorithm**:
  1. Use three nested loops.
  2. The outer loop `i` selects the starting element.
  3. The middle loop `j` selects the ending element.
  4. The inner loop `k` calculates the sum of elements from index `i` to `j` (inclusive).
  5. Update the maximum sum `maxans` with the maximum of its current value and the computed sum.
- **Complexity**:
  - **Time Complexity**: `O(N^3)` where `N` is the size of the array.
  - **Space Complexity**: `O(1)` as we are not using any extra space.
- **File Reference**: [BruteForce.java](./BruteForce.java)

### 2. Better Approach
We can optimize the brute force approach by eliminating the third loop, since the sum of subarray `i` to `j` can be calculated using the sum of subarray `i` to `j-1`.
- **Algorithm**:
  1. Use two nested loops.
  2. The outer loop `i` selects the starting element.
  3. The inner loop `j` selects the ending element.
  4. Maintain a running `sum` that adds `arr[j]` at each step.
  5. Update `maxans` at each step of the inner loop.
- **Complexity**:
  - **Time Complexity**: `O(N^2)`
  - **Space Complexity**: `O(1)`
- **File Reference**: [BetterApproach.java](./BetterApproach.java)

### 3. Optimal Approach (Kadane's Algorithm)
Kadane's Algorithm is an efficient `O(N)` approach to find the maximum sum of a contiguous subarray.
- **Algorithm**:
  1. Initialize `maxans` to `Integer.MIN_VALUE` (or the minimum possible integer) to handle all-negative arrays, and `currsum` to 0.
  2. Traverse the array from left to right.
  3. For each element `arr[i]`, add it to `currsum`.
  4. If `currsum` exceeds `maxans`, update `maxans = currsum`.
  5. If `currsum` becomes negative (i.e., `currsum < 0`), reset `currsum = 0`. This is because a negative sum will only reduce the sum of any subsequent subarray.
  6. Return `maxans`.
- **Complexity**:
  - **Time Complexity**: `O(N)`
  - **Space Complexity**: `O(1)`
- **File Reference**: [OptimalApproach.java](./OptimalApproach.java)