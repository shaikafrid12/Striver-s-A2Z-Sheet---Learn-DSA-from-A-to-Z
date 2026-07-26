# Longest Consecutive Sequence in an Array

**Problem Statement:** Given an array `nums` of `n` integers, return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.

---

## Examples

### Example 1:
- **Input:** `nums = [100, 4, 200, 1, 3, 2]`
- **Output:** `4`
- **Explanation:** The longest sequence of consecutive elements in the array is `[1, 2, 3, 4]`, which has a length of 4.

### Example 2:
- **Input:** `nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]`
- **Output:** `9`
- **Explanation:** The longest sequence of consecutive elements in the array is `[0, 1, 2, 3, 4, 5, 6, 7, 8]`, which has a length of 9.

---

## Approaches

### 1. Brute Force Approach
In this approach, we iterate through each element `x` of the array and find the consecutive elements `x+1, x+2, x+3, ...` using linear search. We keep track of the maximum length found.

* **File:** [BruteForce.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Longest%20Consecutive%20Sequence%20in%20an%20Array'/BruteForce.java)
* **Time Complexity:** $O(N^2)$ (in the worst case, we search for a consecutive sequence for every element).
* **Space Complexity:** $O(1)$ (no extra space used).

### 2. Better Approach (Sorting)
First, we sort the array. Then we iterate through the sorted array to find the longest consecutive sequence. We skip duplicates during the traversal and reset the count whenever the consecutive sequence is broken.

* **File:** [BetterApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Longest%20Consecutive%20Sequence%20in%20an%20Array'/BetterApproach.java)
* **Time Complexity:** $O(N \log N)$ (for sorting the array) + $O(N)$ (for a single pass traversal).
* **Space Complexity:** $O(1)$ (assuming sorting is done in-place).

### 3. Optimal Approach (HashSet)
We store all elements of the array in a `Set` to achieve $O(1)$ lookup time. Then, we iterate through the set. For each element `x`, we check if it is the start of a consecutive sequence (i.e., `x - 1` is not present in the set). If it is, we count how many consecutive elements `x + 1, x + 2, ...` exist in the set.

* **File:** [OptimalApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Longest%20Consecutive%20Sequence%20in%20an%20Array'/OptimalApproach.java)
* **Time Complexity:** $O(N)$ (inserting into the set takes $O(N)$ and searching the sequences takes $O(N)$ since each element is visited at most twice).
* **Space Complexity:** $O(N)$ (to store the elements in the `HashSet`).