# Find Second Smallest and Second Largest Element in an Array

Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Examples
Example 1:
Input:
 [1, 2, 4, 7, 7, 5]  
Output:
  
Second Smallest : 2  
Second Largest : 5
Explanation:
  The elements are sorted as 1, 2, 4, 5, 7, 7.  
Hence, the second smallest element is 2, and the second largest element is 5.

Example 2:
Input:
 [1]  
Output:
  
Second Smallest : -1  
Second Largest : -1  
Explanation:
  Since there is only one element in the array, it is both the largest and smallest element.  
Therefore, there is no second smallest or second largest element present.

## Algorithm

We can solve this problem using two approaches: a Brute Force approach (by sorting) and an Optimal approach (by single-pass linear traversal).

### Step-by-Step Approach (Brute Force):
1. **Edge Case**: If the array size $N < 2$, return/print `-1` for both second smallest and second largest.
2. **Sort**: Sort the array in ascending order.
3. **Second Largest**:
   - The largest element is `largest = arr[N-1]`.
   - Traverse the array backwards from `N-2` down to `0`. The first element `arr[i]` which is not equal to `largest` is our second largest element.
   - If no such element exists, then the second largest element doesn't exist (return `-1`).
4. **Second Smallest**:
   - The smallest element is `smallest = arr[0]`.
   - Traverse the array forwards from `1` to `N-1`. The first element `arr[i]` which is not equal to `smallest` is our second smallest element.
   - If no such element exists, then the second smallest element doesn't exist (return `-1`).

### Step-by-Step Approach (Optimal):
1. **Initialize**: Initialize variables `largest` and `secondLargest` to `Integer.MIN_VALUE`, and `smallest` and `secondSmallest` to `Integer.MAX_VALUE`.
2. **Traverse & Compare**: Loop through the array from index `0` to `N-1`:
   - **For Largest / Second Largest**:
     - If the current element `arr[i] > largest`, set `secondLargest = largest` and update `largest = arr[i]`.
     - Else if `arr[i] > secondLargest` and `arr[i] != largest`, update `secondLargest = arr[i]`.
   - **For Smallest / Second Smallest**:
     - If the current element `arr[i] < smallest`, set `secondSmallest = smallest` and update `smallest = arr[i]`.
     - Else if `arr[i] < secondSmallest` and `arr[i] != smallest`, update `secondSmallest = arr[i]`.
3. **Format Result**:
   - If `secondLargest` is still `Integer.MIN_VALUE`, print `-1`.
   - If `secondSmallest` is still `Integer.MAX_VALUE`, print `-1`.

## Complexity Analysis

### Brute Force:
- **Time Complexity**: $O(N \log N)$ (due to sorting the array of size $N$).
- **Space Complexity**: $O(1)$ auxiliary space (assuming in-place sorting).

### Optimal Approach:
- **Time Complexity**: $O(N)$ (as we traverse the array of size $N$ exactly once).
- **Space Complexity**: $O(1)$ auxiliary space (as we only use a few constant variables).