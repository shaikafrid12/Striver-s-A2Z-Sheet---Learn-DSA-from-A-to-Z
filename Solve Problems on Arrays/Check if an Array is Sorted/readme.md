# Check if an Array is Sorted

Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

## Examples
### Example 1:
Input: N = 5, array[] = {1, 2, 3, 4, 5}
Output: True.
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

### Example 2:
Input: N = 5, array[] = {5, 4, 6, 7, 8}
Output: False.
Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False. Here element 5 is not smaller than or equal to its future elements.

## Algorithm

We can solve this problem using two approaches: a Brute Force approach (by comparing all pairs) and an Optimal approach (by single-pass linear traversal).

### Step-by-Step Approach (Brute Force):
1. **Traverse Pairs**: Use two nested loops to compare all possible pairs of elements `(arr[i], arr[j])` where `i < j`.
2. **Compare**: If any element `arr[j]` is smaller than `arr[i]` (violating the ascending order constraint), return `false`.
3. **Result**: If no violation is found after checking all pairs, return `true`.

### Step-by-Step Approach (Optimal):
1. **Single Pass**: Start a loop from index `1` up to `N-1`.
2. **Compare adjacent elements**: Compare the current element `arr[i]` with the previous element `arr[i-1]`.
3. **Check violation**: If the current element is smaller than the previous element (`arr[i] < arr[i-1]`), the array is not sorted. Return `false` immediately.
4. **Result**: If the loop completes without finding any violation, return `true`.

## Complexity Analysis

### Brute Force:
- **Time Complexity**: $O(N^2)$ (due to nested loops checking every pair).
- **Space Complexity**: $O(1)$ auxiliary space.

### Optimal Approach:
- **Time Complexity**: $O(N)$ (since we only traverse the array once).
- **Space Complexity**: $O(1)$ auxiliary space.