# Remove Duplicates in-place from Sorted Array

Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

## Examples

### Example 1:
Input: arr[] = [1, 1, 2, 2, 2, 3, 3]
Output: 3, arr[] = [1, 2, 3, _, _, _, _]
Explanation: Total number of unique elements is 3, i.e., [1, 2, 3]. Therefore, return 3 after placing [1, 2, 3] in the beginning of the array.

### Example 2:
Input: arr[] = [1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4]
Output: 4, arr[] = [1, 2, 3, 4, _, _, _, _, _, _, _]
Explanation: Total number of unique elements is 4, i.e., [1, 2, 3, 4]. Therefore, return 4 after placing [1, 2, 3, 4] in the beginning of the array.

## Algorithm

We can solve this problem using two approaches: a Brute Force approach (using a Set) and an Optimal approach (using two pointers).

### Step-by-Step Approach (Brute Force):
1. **Declare a Set**: Create a Set data structure (like `HashSet` / `LinkedHashSet` in Java or `set` in C++) to store unique elements.
2. **Insert Elements**: Traverse the sorted array and insert all elements into the set. Since a set stores only unique elements, duplicates will be automatically removed.
3. **Reassign to Array**: Retrieve elements from the set and place them back at the beginning of the original array one by one.
4. **Return Count**: The size of the set represents the number of unique elements. Return this size.

### Step-by-Step Approach (Optimal):
1. **Two Pointers**: Maintain a pointer `i` starting at the first element (index `0`), which keeps track of the position of the last unique element found.
2. **Traverse with Pointer `j`**: Run a loop with a pointer `j` from index `1` to `N - 1`.
3. **Compare**: If the element at `arr[j]` is different from `arr[i]`, it means we found a new unique element.
   - Increment `i`.
   - Update `arr[i] = arr[j]`.
4. **Return Count**: After the loop, the first `i + 1` elements are the unique elements in sorted order. Return `i + 1`.

## Complexity Analysis

### Brute Force:
- **Time Complexity**: $O(N \log N)$ or $O(N)$ (depending on the set implementation. Insertion in `TreeSet` takes $O(N \log N)$, whereas in `HashSet` or `LinkedHashSet` it takes $O(N)$ on average).
- **Space Complexity**: $O(N)$ (to store the elements in the set).

### Optimal Approach:
- **Time Complexity**: $O(N)$ (as we only traverse the array once with a single pass).
- **Space Complexity**: $O(1)$ auxiliary space (in-place modification).