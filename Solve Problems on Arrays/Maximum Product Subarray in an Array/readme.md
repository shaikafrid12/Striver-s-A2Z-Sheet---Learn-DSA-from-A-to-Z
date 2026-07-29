# Maximum Product Subarray in an Array

## Problem Statement
Given an array that contains both negative and positive integers, find the contiguous subarray that has the maximum product.

## Examples

### Example 1
- **Input:** `Nums = [1, 2, 3, 4, 5, 0]`
- **Output:** `120`
- **Explanation:** In the given array, the subarray `[1, 2, 3, 4, 5]` gives the maximum product value, which is $1 \times 2 \times 3 \times 4 \times 5 = 120$.

### Example 2
- **Input:** `Nums = [1, 2, -3, 0, -4, -5]`
- **Output:** `20`
- **Explanation:** In the given array, the subarray `[-4, -5]` gives the maximum product value, which is $(-4) \times (-5) = 20$.

### Example 3
- **Input:** `Nums = [-5, 0, -2]`
- **Output:** `0`
- **Explanation:** The largest product is achieved with the following subarrays: `[0]`, `[-5, 0]`, `[0, -2]`, and `[-5, 0, -2]`, all of which result in a product of 0.

---

## Algorithms

We can solve this problem using different approaches: a Brute Force approach and an Optimal approach using Prefix and Suffix products.

### 1. Brute Force Approach
We check the product of every possible contiguous subarray in the array and keep track of the maximum product found.

- **Step-by-Step Approach:**
  1. Initialize `maxprod` to the first element of the array `arr[0]`.
  2. Run an outer loop with index `i` from `0` to `n - 1` representing the start index of the subarray.
  3. Inside, initialize a running product `prod = 1`.
  4. Run an inner loop with index `j` from `i` to `n - 1` representing the end index of the subarray.
  5. In each iteration of the inner loop, update `prod = prod * arr[j]`.
  6. If `prod` is greater than `maxprod`, update `maxprod = prod`.
  7. After both loops complete, return `maxprod`.

- **Complexity Analysis:**
  - **Time Complexity:** $O(N^2)$ due to the nested loops.
  - **Space Complexity:** $O(1)$ since we are using a constant amount of extra space.

---

### 2. Optimal Approach (Using Prefix and Suffix Product)
If the array has no zeros and an even number of negative numbers, the maximum product is the product of the whole array. If there is an odd number of negative numbers, dividing the array at any negative number splits it into a prefix and suffix; the maximum product will be either the prefix product or the suffix product. When zeros are present, they split the array into subproblems. We can treat zero as a boundary that resets our prefix and suffix products back to 1.

- **Step-by-Step Approach:**
  1. Initialize two variables `pre = 1` and `suf = 1` to store the prefix and suffix products.
  2. Initialize `res = Integer.MIN_VALUE` to store the maximum product.
  3. Traverse the array from index `0` to `n - 1`:
     - If `pre` is `0`, reset `pre = 1`.
     - If `suf` is `0`, reset `suf = 1`.
     - Multiply `pre` by the current element from the start: `pre = pre * arr[i]`.
     - Multiply `suf` by the current element from the end: `suf = suf * arr[n - 1 - i]`.
     - Update `res` with the maximum of `res`, `pre`, and `suf`.
  4. Return `res`.

- **Complexity Analysis:**
  - **Time Complexity:** $O(N)$ because we traverse the array exactly once.
  - **Space Complexity:** $O(1)$ as we only use a few constant variables.