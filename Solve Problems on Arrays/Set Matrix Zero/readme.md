# Set Matrix Zero

**Problem Statement:** Given a matrix, if an element in the matrix is `0`, set its entire row and column to `0` and return the matrix.

### Examples

**Example 1:**
- **Input:** `matrix = [[1, 1, 1], [1, 0, 1], [1, 1, 1]]`
- **Output:** `[[1, 0, 1], [0, 0, 0], [1, 0, 1]]`
- **Explanation:** Since `matrix[1][1] = 0`, the 2nd row and 2nd column are set to `0`.

**Example 2:**
- **Input:** `matrix = [[0, 1, 2, 0], [3, 4, 5, 2], [1, 3, 1, 5]]`
- **Output:** `[[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]]`
- **Explanation:** Since `matrix[0][0] = 0` and `matrix[0][3] = 0`, the 1st row, 1st column, and 4th column are set to `0`.

---

## Algorithms

Here are three approaches to solve this problem:

### 1. Brute Force Approach
- **Concept:** Traverse the matrix. Whenever we find a cell with `0`, we traverse its row and column and mark all non-zero elements with a special dummy value (e.g., `-999999`). In a second pass, we replace all dummy values with `0`.
- **Code:** [BruteforceApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Set%20Matrix%20Zero/BruteforceApproach.java)
- **Complexity:**
  - **Time Complexity:** $O((N \times M) \times (N + M)) + O(N \times M)$
  - **Space Complexity:** $O(1)$ auxiliary space.

### 2. Better Approach
- **Concept:** Use two tracker arrays: `row[N]` and `col[M]` initialized to false. In the first pass, if `matrix[i][j] == 0`, we set `row[i] = true` and `col[j] = true`. In the second pass, if `row[i]` or `col[j]` is true, we set `matrix[i][j] = 0`.
- **Code:** [BetterApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Set%20Matrix%20Zero/BetterApproach.java)
- **Complexity:**
  - **Time Complexity:** $O(N \times M)$
  - **Space Complexity:** $O(N + M)$ for the two tracker arrays.

### 3. Optimal Approach
- **Concept:** Optimize the space to $O(1)$ by using the first row and first column of the matrix itself to store the markers.
  1. We use a variable `col0` to track the state of the first column, and `matrix[0][0]` to track the state of the first row.
  2. Traverse the matrix from `(0,0)` to `(N-1, M-1)`. If `matrix[i][j] == 0`, we set `matrix[i][0] = 0` and if `j != 0` we set `matrix[0][j] = 0`, else we set `col0 = 0`.
  3. Traverse the inner matrix from `(1,1)` to `(N-1, M-1)` and update cells based on the markers.
  4. Finally, update the first row and column using `matrix[0][0]` and `col0`.
- **Code:** [OptimalApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Set%20Matrix%20Zero/OptimalApproach.java)
- **Complexity:**
  - **Time Complexity:** $O(N \times M)$
  - **Space Complexity:** $O(1)$ auxiliary space.

---

### Complexity Summary

| Approach | Time Complexity | Space Complexity |
| :--- | :--- | :--- |
| **Brute Force** | $O((N \times M) \times (N + M))$ | $O(1)$ |
| **Better** | $O(N \times M)$ | $O(N + M)$ |
| **Optimal** | $O(N \times M)$ | $O(1)$ |