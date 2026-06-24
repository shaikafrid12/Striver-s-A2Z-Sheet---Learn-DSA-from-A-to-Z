Problem Statement: Given an array of size N, sort the array using Merge Sort.

Examples:
Example 1:
Input: N = 7, array[] = {3,2,8,5,1,4,23}
Output: 1,2,3,4,5,8,23
Explanation: After sorting the array is: 1, 2, 3, 4, 5, 8, 23

Example 2:
Input: N = 5, array[] = {4,2,1,6,7}
Output: 1,2,4,6,7
Explanation: After sorting the array is: 1, 2, 4, 6, 7

## Algorithm

Merge sort is a divide-and-conquer algorithm. It works by recursively splitting the array into two halves, sorting each half, and then merging the sorted halves.

### Step-by-Step Approach:
1. **Divide**: If the starting index `low` is less than the ending index `high`, find the middle point: `mid = (low + high) / 2`.
2. **Conquer**:
   - Recursively call `mergeSort(arr, low, mid)` to sort the first half.
   - Recursively call `mergeSort(arr, mid + 1, high)` to sort the second half.
3. **Combine**: Call `merge(arr, low, mid, high)` to merge the two sorted halves back into a single sorted subarray.
   - In the `merge` function, use two pointers (`left` starting at `low`, and `right` starting at `mid + 1`) to compare and pick the smaller element.
   - Copy the smaller element into a temporary list and advance the corresponding pointer.
   - Once one half is exhausted, copy the remaining elements of the other half.
   - Copy all sorted elements from the temporary list back to the original array at the range `[low, high]`.

### Complexity Analysis:
- **Time Complexity**: $O(N \log N)$ for Best, Worst, and Average cases.
  - *Reasoning*: The array is split in half recursively, taking $O(\log N)$ levels. At each level, merging elements takes $O(N)$ comparisons/moves.
- **Space Complexity**: $O(N)$ auxiliary space.
  - *Reasoning*: A temporary helper list is needed to store merged elements before copying them back.