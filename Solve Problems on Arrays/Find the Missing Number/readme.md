# Find the Missing Number

**Problem Statement:** Given an array `arr[]` of size `N - 1` with distinct integers in the range of `[1, N]`. This array represents a permutation of the integers from `1` to `N` with one element missing. Find the missing element in the array.

---

## Examples

### Example 1
- **Input:** `arr[] = [8, 2, 4, 5, 3, 7, 1]`
- **Output:** `6`
- **Explanation:** All the numbers from 1 to 8 are present except 6.

### Example 2
- **Input:** `arr[] = [1, 2, 3, 5]`
- **Output:** `4`
- **Explanation:** Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4.

---

## Algorithm

### Brute Force Approach
1. Loop through all numbers from `1` to `N`.
2. For each number, perform a linear search in the array.
3. If a number is not found in the array, return it as the missing number.

**Complexity:**
- **Time Complexity:** $O(N^2)$ (checking $N$ numbers, each taking up to $O(N)$ time)
- **Space Complexity:** $O(1)$

---

### Better Approach (Hashing)
1. Create a hash array `temp` of size `N + 1` initialized to `0` (where `N` is the total elements including the missing one, i.e., `array length + 1`).
2. Iterate through the input array and set `temp[arr[i]] = 1` for each element.
3. Iterate through `temp` from index `1` to `N`. The index where `temp[i] == 0` is the missing number.

**Complexity:**
- **Time Complexity:** $O(N)$ (requires two separate passes of size $N$)
- **Space Complexity:** $O(N)$ (for the frequency array of size $N+1$)

---

### Optimal Approach 1 (Summation Method)
1. Calculate the expected sum of all numbers from `1` to `N` using the formula:
   $$\text{Sum} = \frac{N \times (N + 1)}{2}$$
2. Calculate the actual sum of all elements in the input array.
3. The missing number is the difference: `Expected Sum - Actual Sum`.

**Complexity:**
- **Time Complexity:** $O(N)$ (single pass to calculate the array sum)
- **Space Complexity:** $O(1)$

---

### Optimal Approach 2 (XOR Method)
1. Compute the XOR of all numbers from `1` to `N` (let it be `xor1`).
2. Compute the XOR of all elements in the array (let it be `xor2`).
3. The missing number is the XOR sum of `xor1` and `xor2`: `xor1 ^ xor2`.

**Complexity:**
- **Time Complexity:** $O(N)$ (single pass)
- **Space Complexity:** $O(1)$