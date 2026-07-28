# Rotate Image by 90 Degree

**Problem Statement:** Given an $N \times N$ 2D integer matrix, rotate the matrix by 90 degrees clockwise. The rotation must be done in-place, meaning the input 2D matrix must be modified directly.

### Examples

**Example 1:**
- **Input:** `matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]`
- **Output:** `matrix = [[7, 4, 1], [8, 5, 2], [9, 6, 3]]`
- **Explanation:** The matrix is rotated 90 degrees clockwise.
  ```
  1 2 3      7 4 1
  4 5 6  =>  8 5 2
  7 8 9      9 6 3
  ```

**Example 2:**
- **Input:** `matrix = [[0, 1, 1, 2], [2, 0, 3, 1], [4, 5, 0, 5], [5, 6, 7, 0]]`
- **Output:** `matrix = [[5, 4, 2, 0], [6, 5, 0, 1], [7, 0, 3, 1], [0, 5, 1, 2]]`
- **Explanation:** The matrix is rotated 90 degrees clockwise.

---

## Algorithms

Here are two approaches to solve this problem:

### 1. Brute Force Approach
- **Concept:** Create a temporary 2D array of the same size. We copy each element from the original matrix to its rotated position in the temporary array: `temp[j][n - 1 - i] = matrix[i][j]`. Then we return/print the temporary array.
- **Code:** [BruteForceApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Rotate%20Image%20by%2090%20degree/BruteForceApproach.java)
- **Complexity:**
  - **Time Complexity:** $O(N^2)$ to visit every cell once.
  - **Space Complexity:** $O(N^2)$ extra space for the temporary matrix.

### 2. Optimal Approach (In-Place Rotation)
- **Concept:** 
  1. **Transpose the Matrix:** Swap elements `matrix[i][j]` and `matrix[j][i]` for $i < j$. This turns all rows into columns.
  2. **Reverse Each Row:** Reverse the elements of each row. This mirrors the columns horizontally, completing the 90-degree clockwise rotation.
- **Code:** [OptimalApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Rotate%20Image%20by%2090%20degree/OptimalApproach.java)
- **Complexity:**
  - **Time Complexity:** $O(N^2)$ (Transpose takes $O(N^2)$ and reversing each row takes $O(N^2)$).
  - **Space Complexity:** $O(1)$ auxiliary space as the rotation is done in-place.

---

### Complexity Summary

| Approach | Time Complexity | Space Complexity | In-Place |
| :--- | :--- | :--- | :--- |
| **Brute Force** | $O(N^2)$ | $O(N^2)$ | No |
| **Optimal** | $O(N^2)$ | $O(1)$ | Yes |