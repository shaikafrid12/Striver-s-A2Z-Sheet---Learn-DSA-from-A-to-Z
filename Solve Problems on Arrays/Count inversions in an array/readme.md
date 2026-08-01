# Count Inversions in an Array

**Problem Statement:** Given an array of $N$ integers, count the inversion of the array.

An **inversion pair** is a pair of indices `(i, j)` such that:
- `i < j`
- `arr[i] > arr[j]`

### Examples

**Example 1:**
- **Input:** `N = 5`, `arr[] = {1, 2, 3, 4, 5}`
- **Output:** `0`
- **Explanation:** The array is already sorted in ascending order. For any `i < j`, we will never find a pair where `arr[i] > arr[j]`.

**Example 2:**
- **Input:** `N = 5`, `arr[] = {5, 4, 3, 2, 1}`
- **Output:** `10`
- **Explanation:** The array is sorted in descending order. Every pair of elements is an inversion. 
  The inversion pairs are `(5, 4)`, `(5, 3)`, `(5, 2)`, `(5, 1)`, `(4, 3)`, `(4, 2)`, `(4, 1)`, `(3, 2)`, `(3, 1)`, and `(2, 1)`. 
  Total count = $4 + 3 + 2 + 1 = 10$ pairs (which corresponds to $N \times (N - 1) / 2$).

**Example 3:**
- **Input:** `N = 5`, `arr[] = {5, 3, 2, 1, 4}`
- **Output:** `7`
- **Explanation:** There are 7 inversion pairs: `(5, 3)`, `(5, 2)`, `(5, 1)`, `(5, 4)`, `(3, 2)`, `(3, 1)`, and `(2, 1)`.

---

## Algorithms

Here are the approaches to solve this problem:

### 1. Brute Force Approach
- **Concept:** Use two nested loops. The outer loop selects an element at index `i`, and the inner loop checks all elements to the right of `i` (index `j`). If `arr[i] > arr[j]`, we increment the inversion count.
- **Code:** [BruteForceApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Count%20inversions%20in%20an%20array/BruteForceApproach.java)
- **Complexity:**
  - **Time Complexity:** $O(N^2)$ due to the nested loops.
  - **Space Complexity:** $O(1)$ auxiliary space.

### 2. Optimal Approach (Using Merge Sort)
- **Concept:** Use a modified Merge Sort algorithm.
  1. Recursively divide the array into two halves until we have single-element subarrays.
  2. While merging two sorted halves (`left` and `right`), we count how many inversions exist:
     - If `arr[left] <= arr[right]`, then `arr[left]` does not form an inversion with `arr[right]`. We simply copy `arr[left]` to a temporary array.
     - If `arr[left] > arr[right]`, then because the left partition is sorted, all remaining elements in the left partition from index `left` to `mid` are also strictly greater than `arr[right]`. Thus, we can add `(mid - left + 1)` to our inversion count and copy `arr[right]` to the temporary array.
  3. Copy the sorted temporary array back to the original array.
- **Code:** [OptimalApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Count%20inversions%20in%20an%20array/OptimalApproach.java)
- **Complexity:**
  - **Time Complexity:** $O(N \log N)$ since we divide the array in $O(\log N)$ steps and do $O(N)$ merge work at each step.
  - **Space Complexity:** $O(N)$ for the temporary array used in merging.

---

### Complexity Summary

| Approach | Time Complexity | Space Complexity |
| :--- | :--- | :--- |
| **Brute Force** | $O(N^2)$ | $O(1)$ |
| **Optimal (Merge Sort)** | $O(N \log N)$ | $O(N)$ |