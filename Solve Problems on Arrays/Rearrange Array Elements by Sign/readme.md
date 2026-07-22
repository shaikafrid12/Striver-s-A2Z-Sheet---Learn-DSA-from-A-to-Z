# Rearrange Array Elements by Sign

## Problem Statement
There is an array `arr` of size `N` with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must rearrange the array to alternately place positive and negative values, starting with a positive number.

> **Note**: The relative ordering of elements of the same sign must be preserved.

---

## Examples

### Example 1
- **Input:** `arr[] = {1, 2, -4, -5}`, `N = 4`
- **Output:** `1 -4 2 -5`
- **Explanation:** 
  - Positive elements: `1, 2`
  - Negative elements: `-4, -5`
  - Alternating them while keeping order: `1` (pos), `-4` (neg), `2` (pos), `-5` (neg).

### Example 2
- **Input:** `arr[] = {1, 2, -3, -1, -2, 3}`, `N = 6`
- **Output:** `1 -3 2 -1 3 -2`
- **Explanation:** 
  - Positive elements: `1, 2, 3`
  - Negative elements: `-3, -1, -2`
  - Alternating them while keeping order: `1` (pos), `-3` (neg), `2` (pos), `-1` (neg), `3` (pos), `-2` (neg).

---

## Algorithms & Approaches

### 1. Brute Force Approach
In this approach, we separate the positive and negative elements into two temporary lists and then reconstruct the array.
- **Algorithm**:
  1. Use two dynamic arrays/lists: `pos` for positive numbers and `neg` for negative numbers.
  2. Traverse the input array from `0` to `N-1`. If an element is positive, add it to `pos`. If negative, add it to `neg`.
  3. Since there are equal positive and negative elements, both lists will have size `N/2`.
  4. Fill the array alternately:
     - Place positive elements at even indices: `arr[2*i] = pos.get(i)`
     - Place negative elements at odd indices: `arr[2*i + 1] = neg.get(i)`
- **Complexity**:
  - **Time Complexity**: `O(N)` because we traverse the array once to separate elements and once to rebuild.
  - **Space Complexity**: `O(N)` to store elements in `pos` and `neg` lists.
- **File Reference**: [BruteForceApproach.java](./BruteForceApproach.java)

### 2. Optimal Approach (Single Pass)
We can optimize the implementation to run in a single pass using a new array and two pointers (`posindex` and `negindex`).
- **Algorithm**:
  1. Create a new array `ans` of size `N`.
  2. Initialize `posindex = 0` (for placing positive numbers at even positions) and `negindex = 1` (for placing negative numbers at odd positions).
  3. Traverse the array. For each element:
     - If it is positive, place it at `ans[posindex]` and increment `posindex` by `2`.
     - If it is negative, place it at `ans[negindex]` and increment `negindex` by `2`.
  4. Return the `ans` array.
- **Complexity**:
  - **Time Complexity**: `O(N)` (single pass traversal).
  - **Space Complexity**: `O(N)` for the output array `ans`.
- **File Reference**: [OptimalApproach.java](./OptimalApproach.java)