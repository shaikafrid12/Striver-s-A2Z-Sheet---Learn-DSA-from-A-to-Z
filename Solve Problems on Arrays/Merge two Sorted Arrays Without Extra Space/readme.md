# Merge two Sorted Arrays Without Extra Space

Problem Statement: Given two sorted integer arrays nums1 and nums2, merge both the arrays into a single array sorted in non-decreasing order.
The final sorted array should be stored inside the array nums1 and it should be done in-place.
Array nums1 has a length of m + n, where the first m elements denote the elements of nums1 and rest are 0s whereas nums2 has a length of n.

## Examples
### Example 1:
**Input:** `nums1 = [-5, -2, 4, 5, 0, 0, 0]`, `nums2 = [-3, 1, 8]`  
**Output:** `[-5, -3, -2, 1, 4, 5, 8]`  
**Explanation:** The merged array is: `[-5, -3, -2, 1, 4, 5, 8]`, where `[-5, -2, 4, 5]` are the actual elements from `nums1` and `[-3, 1, 8]` are from `nums2`.

### Example 2:
**Input:** `nums1 = [0, 2, 7, 8, 0, 0, 0]`, `nums2 = [-7, -3, -1]`  
**Output:** `[-7, -3, -1, 0, 2, 7, 8]`  
**Explanation:** The merged array is: `[-7, -3, -1, 0, 2, 7, 8]`, where `[0, 2, 7, 8]` are the actual elements from `nums1` and `[-7, -3, -1]` are from `nums2`.

---

## Approaches

### 1. Brute Force Approach (Using Extra Space)
*   **Concept:**
    1. Create a temporary array `temp` of size `m` (which is $m_{actual\_elements} + n_{actual\_elements}$).
    2. Maintain two pointers, `left` for `nums1` and `right` for `nums2`.
    3. Compare elements at `left` and `right` and copy the smaller one to `temp`.
    4. Copy any remaining elements from either array to `temp`.
    5. Copy the sorted elements from `temp` back to `nums1`.
*   **Complexity:**
    *   **Time Complexity:** $O(m + n)$ — Single pass to merge and another pass to copy back.
    *   **Space Complexity:** $O(m + n)$ — Due to the temporary helper array.

### 2. Optimal Approach (Three Pointers / Right-to-Left Merge)
*   **Concept:**
    1. Since `nums1` has enough empty space at the end to hold the merged elements, we can merge elements from **right to left** (largest to smallest) to avoid overwriting elements in `nums1`.
    2. Initialize three pointers:
       *   `i = m - n - 1` (points to the last actual element in `nums1`).
       *   `j = n - 1` (points to the last element in `nums2`).
       *   `k = m - 1` (points to the very end of `nums1`).
    3. Compare `nums1[i]` and `nums2[j]`. Place the larger element at `nums1[k]` and decrement the corresponding pointer and `k`.
    4. If there are still elements remaining in `nums2` (`j >= 0`), copy them to the remaining positions in `nums1`.
    5. If `nums2` is exhausted but there are elements left in `nums1`, they are already in their correct places, so no action is needed.
*   **Code:** See [Merge.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Merge%20two%20Sorted%20Arrays%20Without%20Extra%20Space/Merge.java)
*   **Complexity:**
    *   **Time Complexity:** $O(m + n)$ — We visit each index to be filled exactly once.
    *   **Space Complexity:** $O(1)$ — Done in-place without any extra memory.