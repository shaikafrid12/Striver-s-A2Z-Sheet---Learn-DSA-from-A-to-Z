# Count Subarray Sum Equals K

**Problem Statement:** Given an array of integers and an integer `k`, return the total number of subarrays whose sum equals `k`. A subarray is a contiguous non-empty sequence of elements within an array.

### Examples

**Example 1:**
- **Input:** $N = 4$, $\text{array}[] = \{3, 1, 2, 4\}$, $k = 6$
- **Output:** $2$
- **Explanation:** The subarrays that sum up to $6$ are $[3, 1, 2]$ and $[2, 4]$.

**Example 2:**
- **Input:** $N = 3$, $\text{array}[] = \{1, 2, 3\}$, $k = 3$
- **Output:** $2$
- **Explanation:** The subarrays that sum up to $3$ are $[1, 2]$ and $[3]$.

---

## Algorithms

Here are three approaches to solve this problem, ranging from Brute Force to the Optimal solution using Prefix Sums and HashMaps.

### 1. Brute Force Approach
The simplest way is to check the sum of all possible subarrays.
- **Concept:** We generate all possible subarrays using two nested loops for the starting index `i` and ending index `j`. A third loop runs from `i` to `j` to calculate the sum of that subarray.
- **Code:** [BruteforceApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Count%20Subarray%20sum%20Equals%20K/BruteforceApproach.java)
- **Complexity:**
  - **Time Complexity:** $O(N^3)$ where $N$ is the number of elements.
  - **Space Complexity:** $O(1)$ auxiliary space.

### 2. Better Approach
We can optimize the brute force method by calculating the subarray sum on the fly.
- **Concept:** Instead of using a third loop to calculate the sum from `i` to `j`, we can keep a running sum in the inner loop as we transition from `j` to `j + 1`.
- **Code:** [BetterApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Count%20Subarray%20sum%20Equals%20K/BetterApproach.java)
- **Complexity:**
  - **Time Complexity:** $O(N^2)$
  - **Space Complexity:** $O(1)$

### 3. Optimal Approach (Prefix Sum & HashMap)
We can solve this problem in linear time using a Prefix Sum technique paired with a Hash Map.
- **Concept:** 
  1. Let the prefix sum of elements up to index $i$ be $S_i$ (`currentsum`).
  2. If there exists a subarray ending at index $i$ with a sum equal to $k$, then the prefix sum up to the start of that subarray must be $S_i - k$.
  3. We keep track of the frequency of each prefix sum in a HashMap.
  4. For each element, we calculate the running `currentsum`, check if `currentsum - k` exists in the map, and add its frequency to our count.
  5. We initialize the HashMap with `{0: 1}` to handle cases where the subarray starting from the 0th index itself has a sum equal to $k$.
- **Code:** [OptimalApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Count%20Subarray%20sum%20Equals%20K/OptimalApproach.java)
- **Complexity:**
  - **Time Complexity:** $O(N)$ (average) or $O(N \log N)$ if a TreeMap/map with search overhead is used. In Java, `HashMap` gives $O(1)$ operations on average, so the total time complexity is $O(N)$.
  - **Space Complexity:** $O(N)$ for storing prefix sum frequencies in the map.

---

### Complexity Summary

| Approach | Time Complexity | Space Complexity |
| :--- | :--- | :--- |
| **Brute Force** | $O(N^3)$ | $O(1)$ |
| **Better** | $O(N^2)$ | $O(1)$ |
| **Optimal** | $O(N)$ | $O(N)$ |