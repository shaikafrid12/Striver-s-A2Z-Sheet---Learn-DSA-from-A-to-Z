# Count Reverse Pairs

**Problem Statement:** Given an array of numbers, you need to return the count of reverse pairs. Reverse Pairs are those pairs where `i < j` and `arr[i] > 2 * arr[j]`.

### Examples

**Example 1:**
- **Input:** `N = 5`, `arr[] = {1, 3, 2, 3, 1}`
- **Output:** `2`
- **Explanation:** The pairs are `(3, 1)` (indices 1 and 4) and `(3, 1)` (indices 3 and 4) as both satisfy the condition `arr[i] > 2 * arr[j]`.

**Example 2:**
- **Input:** `N = 4`, `arr[] = {3, 2, 1, 4}`
- **Output:** `1`
- **Explanation:** There is only 1 pair `(3, 1)` (indices 0 and 2) that satisfies the condition `arr[i] > 2 * arr[j]`.

---

## Algorithms

Here are the approaches to solve this problem:

### 1. Brute Force Approach
- **Concept:** Check every possible pair `(i, j)` where `i < j` using nested loops and verify the condition `arr[i] > 2 * arr[j]`.
- **Code:** [BruteForceApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Count%20Reverse%20Pairs/BruteForceApproach.java)
- **Complexity:**
  - **Time Complexity:** $O(N^2)$ due to nested loops.
  - **Space Complexity:** $O(1)$ auxiliary space.

### 2. Optimal Approach (Using Merge Sort)
- **Concept:** Use a modified Merge Sort algorithm. 
  1. We split the array into two halves recursively.
  2. Before merging the two sorted halves (`left` and `right`), we count the reverse pairs:
     - For each element in the `left` sorted partition, find how many elements in the `right` sorted partition satisfy `arr[i] > 2 * arr[j]`.
     - Since the partitions are sorted, we can use a two-pointer technique to count the pairs in $O(N)$ time per merge step.
  3. Merge the two sorted partitions to keep the array sorted for the next stages of recursion.
  4. Use 64-bit integer (`long`) multiplication to avoid integer overflow issues when evaluating `2 * arr[j]`.
- **Code:** [OptimalApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Count%20Reverse%20Pairs/OptimalApproach.java)
- **Complexity:**
  - **Time Complexity:** $O(N \log N)$ where we split the array in $O(\log N)$ levels and do $O(N)$ work at each level for counting and merging.
  - **Space Complexity:** $O(N)$ auxiliary space for the temporary list used in merging.

---

### Complexity Summary

| Approach | Time Complexity | Space Complexity |
| :--- | :--- | :--- |
| **Brute Force** | $O(N^2)$ | $O(1)$ |
| **Optimal (Merge Sort)** | $O(N \log N)$ | $O(N)$ |