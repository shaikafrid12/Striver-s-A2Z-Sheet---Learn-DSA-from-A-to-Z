# Find the repeating and missing numbers

Problem Statement: Given an integer array nums of size n containing values from [1, n] and each value appears exactly once in the array, except for A, which appears twice and B which is missing.
Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.

Note: You are not allowed to modify the original array.

## Examples
### Example 1:
**Input:** `nums = [3, 5, 4, 1, 1]`  
**Output:** `[1, 2]`  
**Explanation:** 1 appears twice in the array, and 2 is missing from the array. So the output is `[1, 2]`.

### Example 2:
**Input:** `nums = [1, 2, 3, 6, 7, 5, 7]`  
**Output:** `[7, 4]`  
**Explanation:** 7 appears twice in the array, and 4 is missing from the array. So the output is `[7, 4]`.

---

## Approaches

### 1. Brute Force Approach
*   **Concept:** For each number from `1` to `N`, count its frequency by iterating through the array. The number with frequency `2` is the repeating number, and the number with frequency `0` is the missing number.
*   **Code:** See [BruteForce.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Find%20the%20repeating%20and%20missing%20numbers/BruteForce.java)
*   **Complexity:**
    *   **Time Complexity:** $O(N^2)$ — Two nested loops.
    *   **Space Complexity:** $O(1)$ — No extra space used.

### 2. Better Approach (Hashing / Frequency Array)
*   **Concept:** Maintain a frequency array of size `N + 1` initialized to `0`. Iterate through the input array and populate the frequency array. Then, traverse the frequency array from `1` to `N` to find the numbers with frequency `2` (repeating) and frequency `0` (missing).
*   **Code:** See [BetterApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Find%20the%20repeating%20and%20missing%20numbers/BetterApproach.java)
*   **Complexity:**
    *   **Time Complexity:** $O(N)$ — One pass to count frequencies, and another pass of size $N$ to find the missing and repeating numbers.
    *   **Space Complexity:** $O(N)$ — An extra array of size $N + 1$ is used.

### 3. Optimal Approach 1 (Math-Based)
*   **Concept:** 
    1. Calculate sum of first $N$ natural numbers: $S_N = \frac{N(N+1)}{2}$
    2. Calculate sum of squares of first $N$ natural numbers: $S_{2N} = \frac{N(N+1)(2N+1)}{6}$
    3. Calculate the actual sum of array elements ($S$) and actual sum of squares of array elements ($S_2$).
    4. Express relations:
       $$S - S_N = X - Y$$ (Equation 1)
       $$S_2 - S_{2N} = X^2 - Y^2 = (X - Y)(X + Y)$$ (Equation 2)
    5. Divide Equation 2 by Equation 1 to find $X + Y$:
       $$X + Y = \frac{S_2 - S_{2N}}{S - S_N}$$
    6. Solve the two equations to get $X$ (repeating) and $Y$ (missing).
*   **Code:** See [OptimalApproach.java](file:///c:/Users/shaik/Documents/Coding/Striver's%20A2Z%20Sheet%20-%20Learn%20DSA%20from%20A%20to%20Z/Solve%20Problems%20on%20Arrays/Find%20the%20repeating%20and%20missing%20numbers/OptimalApproach.java)
*   **Complexity:**
    *   **Time Complexity:** $O(N)$ — Single pass to calculate the sum and sum of squares.
    *   **Space Complexity:** $O(1)$ — Only a few variables used.

### 4. Optimal Approach 2 (XOR / Bit Manipulation)
*   **Concept:**
    1. XOR all array elements together: $XR_1 = \text{nums}[0] \oplus \text{nums}[1] \oplus \dots \oplus \text{nums}[n-1]$
    2. XOR all numbers from $1$ to $N$: $XR_2 = 1 \oplus 2 \oplus \dots \oplus N$
    3. Calculate the combined XOR: $XR = XR_1 \oplus XR_2 = X \oplus Y$
    4. Find the first set bit in $XR$ (let's say from the right): `bitNo = XR & ~(XR - 1)`
    5. Group the array elements and numbers from $1$ to $N$ into two groups:
       *   **Group 1:** Numbers with the `bitNo`-th bit set.
       *   **Group 2:** Numbers with the `bitNo`-th bit not set.
    6. XOR all numbers in Group 1 to find one candidate, and Group 2 to find the other.
    7. Traverse the array to identify which of the two candidates is the repeating number and which is the missing number.
*   **Complexity:**
    *   **Time Complexity:** $O(N)$ — Two passes over the arrays/numbers.
    *   **Space Complexity:** $O(1)$ — Only variable states stored.