Problem Statement: Given an array of N integers, write a program to implement Selection Sort and sort the array in ascending order.

Examples:
Example 1:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

Example 2:
Input: N=5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting the array is: 1, 2, 3, 4, 5

## Algorithm

Selection sort works by repeatedly finding the minimum element from the unsorted part of the array and putting it at the beginning.

### Step-by-Step Approach:
1. **Outer Loop**: Run a loop from `i = 0` to `N - 2` (to select the starting position of the unsorted part).
2. **Find Minimum**:
   - Initialize `min_idx = i`.
   - Run an inner loop from `j = i + 1` to `N - 1`.
   - If `array[j] < array[min_idx]`, update `min_idx = j`.
3. **Swap**: After finding the minimum element in the unsorted range `[i, N-1]`, swap the element at `min_idx` with the element at index `i`.
4. Repeat this process until the entire array is sorted.

### Complexity Analysis:
- **Time Complexity**: $O(N^2)$ (Best, Worst, and Average cases).
- **Space Complexity**: $O(1)$ auxiliary space (in-place sorting).