# Spiral Traversal of Matrix

**Problem Statement:** Given a Matrix, print the given matrix in spiral order.

### Examples

**Example 1:**
- **Input:** `Matrix[][]` = 
  ```
  { {  1,  2,  3,  4 },
    {  5,  6,  7,  8 },
    {  9, 10, 11, 12 },
    { 13, 14, 15, 16 } }
  ```
- **Output:** `1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10`
- **Explanation:** The output is obtained by traversing the matrix in spiral form starting from the top-left corner.

**Example 2:**
- **Input:** `Matrix[][]` = 
  ```
  { { 1, 2, 3 }, 
    { 4, 5, 6 },
    { 7, 8, 9 } }
  ```
- **Output:** `1, 2, 3, 6, 9, 8, 7, 4, 5`
- **Explanation:** The output is obtained by traversing the matrix in spiral form.

---

## Algorithm

The spiral traversal can be implemented using 4 pointers representing the boundaries of the matrix:
1. `top`: Starting row boundary (initialized to `0`)
2. `bottom`: Ending row boundary (initialized to `n - 1`)
3. `left`: Starting column boundary (initialized to `0`)
4. `right`: Ending column boundary (initialized to `m - 1`)

### Traversal Steps:
We run a loop while `top <= bottom` and `left <= right`:
1. **Left to Right:** Traverse the `top` row from column `left` to `right`. Increment `top`.
2. **Top to Bottom:** Traverse the `right` column from row `top` to `bottom`. Decrement `right`.
3. **Right to Left (Conditional):** If `top <= bottom` is still true, traverse the `bottom` row from column `right` down to `left`. Decrement `bottom`.
4. **Bottom to Top (Conditional):** If `left <= right` is still true, traverse the `left` column from row `bottom` down to `top`. Increment `left`.

- **Code:** [Spiral.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Spiral%20Traversal%20of%20Matrix/Spiral.java)

### Complexity

| Time Complexity | Space Complexity |
| :--- | :--- |
| $O(N \times M)$ | $O(1)$ auxiliary space ($O(N \times M)$ to store output list) |