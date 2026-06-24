Problem Statement: Given an array, we have to find the largest element in the array.

Examples
Example 1:
Input:
 arr[] = {2, 5, 1, 3, 0}  
Output:
 5  
Explanation:
  
5 is the largest element in the array.

Example 2:
Input:
 arr[] = {8, 10, 5, 7, 9}  
Output:
 10  
Explanation:
  
10 is the largest element in the array.

## Algorithm

We can solve this problem using two approaches: a Brute Force approach (by sorting) and an Optimal approach (by linear traversal).

### Step-by-Step Approach (Brute Force):
1. **Sort**: Sort the array in ascending order.
2. **Result**: The largest element will be at the last index of the sorted array, which is `arr[N-1]` (where `N` is the size of the array).

### Step-by-Step Approach (Optimal):
1. **Initialize**: Create a variable `maxvalue` and initialize it with the first element of the array (`arr[0]`).
2. **Traverse**: Loop through the array from the second element (index `1`) to the last element (index `N-1`).
3. **Compare**: At each step, if the current element `arr[i]` is greater than `maxvalue`, update `maxvalue = arr[i]`.
4. **Result**: After completing the traversal, `maxvalue` will hold the largest element in the array.

## Complexity Analysis

### Brute Force:
- **Time Complexity**: $O(N \log N)$ (since sorting an array of size $N$ takes $O(N \log N)$ time).
- **Space Complexity**: $O(1)$ auxiliary space (or $O(N)$ depending on the sorting algorithm used).

### Optimal Approach:
- **Time Complexity**: $O(N)$ (as we traverse the array of size $N$ exactly once).
- **Space Complexity**: $O(1)$ auxiliary space (as we only use a single variable `maxvalue` to store the maximum element).
