Problem Statement: Given an array of N integers, write a program to implement the Bubble Sort algorithm to sort the array in ascending order.

Examples:
Example 1:
Input: N = 5, array[] = {5,4,3,2,1}
Output: 1,2,3,4,5
Explanation: After sorting we get 1,2,3,4,5

Example 2:
Input: N = 6, array[] = {13,46,24,52,20,9}
Output: 9,13,20,24,46,52
Explanation: After sorting we get 9,13,20,24,46,52

## Algorithm

Bubble sort works by repeatedly swapping adjacent elements if they are in the wrong order. 

### Step-by-Step Approach (Brute Force):
1. **Outer Loop**: Run a loop from `i = N - 1` down to `0`. (Each pass places the largest element of the unsorted part at its correct position).
2. **Inner Loop**: Run a loop from `j = 0` to `i - 1` to compare adjacent elements.
3. **Compare & Swap**: If `array[j] > array[j + 1]`, swap them.
4. Repeat until the array is fully sorted.

### Step-by-Step Approach (Optimized):
1. In the worst case, the array is already sorted, but the brute force approach still runs in $O(N^2)$ time.
2. To optimize, add a flag `didSwap` initialized to `false` inside the outer loop.
3. If any swap happens during the inner loop pass, set `didSwap` to `true`.
4. After the inner loop completes, if `didSwap` remains `false`, it means the array is already sorted. Break out of the loop early.

### Complexity Analysis:

#### Brute Force:
- **Time Complexity**: $O(N^2)$ for Best, Worst, and Average cases.
- **Space Complexity**: $O(1)$ auxiliary space.

#### Optimized Approach:
- **Time Complexity**:
  - **Worst & Average Case**: $O(N^2)$ when the array is reverse sorted or unsorted.
  - **Best Case**: $O(N)$ when the array is already sorted (runs only 1 pass of the outer loop).
- **Space Complexity**: $O(1)$ auxiliary space.
